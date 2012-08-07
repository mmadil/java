// Demonstrate lifetime of a variable

class LifeTime{
  public static void main(String arg[]){
    int x;
    for(x=0;x<3;x++){
      int y = -1; // y is initialized each time block is entered.
      System.out.println("y is : "+y); // this is always printed as -1

      y = 100;
      System.out.println("y is now: "+y);
      }
    }
}
