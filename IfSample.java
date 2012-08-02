class IfSample{
 public static void main(String arg[]){
  int x,y;
  x=10;
  y=20;
  if(x<y) System.out.println("Now x is less than y");
  x=x*2;
  if(x==y) System.out.println("Now x is equal to y");
  x=x*2;
  if(x>y) System.out.println("Now x is greater than y");
  
  // This wont be displayed as the statement is never true
  
  if(x==y) System.out.println("This wont be displayed");
  }
}
