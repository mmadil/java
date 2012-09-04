//This program declares two objects.
class Box{
 double width;
 double height;
 double depth;
}

class BoxDemo2{
 public static void main(String arg[]){
  Box mybox1 = new Box();
  Box mybox2 = new Box();

 double vol;

 // assign values to mybox1 instance variables

 mybox1.width = 10;
 mybox1.height = 20;
 mybox1.depth = 15;

 // assign values to mybox2 intance variables
 mybox2.width = 3;
 mybox2.height = 6;
 mybox2.depth = 9;

 //Compute the volume of first box
 vol = mybox1.width * mybox1.height * mybox1.depth;  
 System.out.println("Volume of box 1 is "+vol);
 //Compute the volume of second box
 vol = mybox2.width * mybox2.height * mybox2.depth;
 System.out.println("Volume of box 2 is "+vol);
}
}
