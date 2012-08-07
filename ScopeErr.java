// This program will not compile

class ScopeErr{
  public static void main(String arg[]){
    int bar = 1;
      { // creates a new scope
        int bar =2;
      }
   }
}
