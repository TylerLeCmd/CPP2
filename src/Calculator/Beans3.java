import java.util.Scanner;

public class Beans3 {
   public static void main(String[] args) {
      boolean runned = true;
      String cont = "Y";
      Scanner beans = new Scanner(System.in);
      while (cont.equals("Y") || cont.equals("y")){
       System.out.println("Please pick a number, any number!");
       float numPick = beans.nextFloat();
       System.out.println("Pick a second number! Again, any number!");
       float numPick2 = beans.nextFloat();
       System.out.println("Pick your operation (Choices are +, -, *, /)");
       beans.nextLine();
       String op = beans.nextLine();
       System.out.println(calcMaths (numPick, numPick2, op));
       if (runned){
         System.out.println("Calculate another problem? (Y/N)");
       }
       else if (!runned){
         System.out.println("Oops, that's not a valid operation!");
       }
      String bbb = beans.nextLine();
      cont = bbb;
      }
   }
   static float calcMaths(float first, float second, String opss) {
      if (opss.equals("+")){
         System.out.println("Adding " + first + " and " + second);
         return first + second;
     }else if (opss.equals("-")){
         System.out.println("Subtracting " + first + " and " + second);
         return first - second;
     }else if (opss.equals("*")){
         System.out.println("Multiplying " + first + " and " + second);
         return first * second;
     }else if (opss.equals("/")){
         System.out.println("Dividing " + first + " and " + second);
         return first / second;
     }
     else {
        return first;
     }
   }
}
