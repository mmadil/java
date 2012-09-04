// This class defines an integer stack that can hold 10 values

class stack{
 int stack[] = new int[10];
 int tos;

 //initialize top of the stack

 stack(){
  tos = -1;
 }

 //Push an item onto the stack
 void push(int item){
  if(tos == 9) System.out.println("Stack is full");
  else stack[++tos] = item;
 }

 //Pop an item from stack
 int pop(){
  if(tos<0){
   System.out.println("Stack underflow");
   return 0;
  }
  else
   return stack[tos--];
  }
}

class TestStack{
 public static void main(String args[]){
  stack mystack1 = new stack();
  stack mystack2 = new stack();

 //push some numbers onto the stack
  for(int i=0;i<10;i++) mystack1.push(i);
  for(int j=10;j<20;j++) mystack2.push(j);

 //pop stack numbers of the stack
  System.out.println("Stack in mystack1 : ");
   for(int i=0;i<10;i++)
    System.out.println(mystack1.pop());

  System.out.println("Stack in mystack2 : ");
   for(int i=0;i<10;i++)
    System.out.println(mystack2.pop());
  }
}
