// Example of recursion

class Factorial{
 // This is a recursive function 
 int fact(int n){
  int result;
  if(n==1) return 1;
  result = fact(n-1)*n;
  return result;
  }
}

class Recursion{
 public static void main(String args[]){
  Factorial f = new Factorial();
  System.out.println("Factorial of 3 is : "+f.fact(3));
  System.out.println("Factorial of 10 is : "+f.fact(10));
  }
}
