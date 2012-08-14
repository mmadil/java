// Demonstrate ternary operator

class Ternary{
  public static void main(String arg[]){
    int i,k;

    i = 10;
    
    k = i < 10 ? -i : i; // get absolute value of i
    System.out.print("Absolute value of ");
    System.out.println(i + " is " +k);

    i = -10;

    k = i < 10 ? -i : i; // get absolute value of i
    System.out.print("Absolute value of ");
    System.out.println(i + " is " +k);
    }
}
