class CastingProblem{
  public static void main(String arg[]){
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;

    double result = (f*b)+(i/c)-(d*s);

    System.out.println((f*b)+" + "+(i/c)+" - "+(d*s));
    System.out.println("Result : "+result);
    }
}
