class BScope{
 public static void main(String arg[]){
  int x;
  x=10;
  if(x == 10){  // start of new block
   int y = 20;  // known to this block only

   //x and y both known here
   System.out.println("x and y are: " +x +" " +y);
   x=y*2;
   }
  
  // y = 100; will show error in this block
  // x is known here

  System.out.println("x is : "+x);
 }
}
