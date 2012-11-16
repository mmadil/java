// Use a string to control a switch statement

class StringSwitch{
 public static void main(String arg[]){
  String str="two";

  switch(str){
   case "one":
    System.out.println("selected one");
    break;

   case "two":
    System.out.println("selected two");
    break;

   case "three":
    System.out.println("selected three");
    break;

   default:
    System.out.println("no match");
    break;
    }
  }
}
