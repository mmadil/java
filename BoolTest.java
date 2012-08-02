class BoolTest{
 public static void main(String arg[]){
  boolean b;
  b = false;
  System.out.println("b now is "+b);
  b = true;
  System.out.println("b now is "+b);
  
  //a boolean value can control the if stat

  if(b) System.out.println("This is executed");
  
  b = false;

  if(b) System.out.println("This will not be executed");

  //outcome of relational operator in a boolean value

  System.out.println("10>9 is " +(10>9));
 }
}
