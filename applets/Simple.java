import java.awt.*;
import java.applet.*;
/*
<applet code="Simple" width=300 height=200>
</applet>
*/
public class Simple extends Applet 
{
 	String msg;
 	public void init()
  	{
 	setBackground(Color.red);
 		setForeground(Color.yellow);
   		msg= "inside init()";
 	}
 	public void start()
 	{
  		msg = "inside start()";
 	}
 	public void paint(Graphics g) 
 	{
 		//msg  = "Inside Paint()";
 		g.drawString(msg,20, 50);
 	}
 }
