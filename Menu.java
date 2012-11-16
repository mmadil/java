// Program using a do-while to prove a menu selector - a simple help system.

class Menu{
 public static void main(){
  char choice;
  do {
   System.out.println("Help ");
   System.out.println("1. if");
   System.out.println("2. Switch");
   System.out.println("3. While");
   System.out.println("4. do-while");
   System.out.println("5. for \n\n");
   System.out.println("Choose one : ");

   choice = (char)System.in.read();
}

while (choice >'1' || choice <'5');
 System.out.println("\n");

switch(choice){
 case '1':
 System.out.println("The if ");
 System.out.println("if(condition)statements");
 System.out.println("more statements");
 break;

case '2':
 System.out.println("The Switch ");
 System.out.println("Switch (expression) {");
 System.out.println("Case constant :");
 System.out.println("Statement sequence;");
 System.out.println("break;");
 System.out.println("\\");
 System.out.println("}");
 break;

case '3':
 System.out.println("The while : ");
 System.out.println("while(condition) statement;");
 break;

case '4':
 System.out.println("The do-while : ");
 System.out.println("do {");
 System.out.println("Statements; ");
 System.out.println("} while(condition)");
 break;

case '5':
 System.out.println("The for : ");
 System.out.println("for(int;condition;iteration)");
 System.out.println("statements");
 break;
}
}
}
