class Test{
 int a,b;
 Test(int i, int j){
  a = i;
  b = j;
  }

 // pass an object

 void meth(Test o){
  o.a *= 2;
  o.b /= 2;
  }
}

class CallByValue2{
 public static void main(String args[]){
  Test ob = new Test(15,20);
  System.out.println("Before : "+ob.a+" "+ob.b);
  ob.meth(ob);
  System.out.println("After : "+ob.a+" "+ob.b);
  }
}
  
