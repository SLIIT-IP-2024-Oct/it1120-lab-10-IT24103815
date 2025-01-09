import java.util.Scanner;
      public class IT24103815Lab10Q1A {
          public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter the mark:");
             int mark = scanner.nextInt();

          assert (mark >= 0 && mark <= 100) : "Invalid Mark";

          System.out.println("Mark is Validated");
     }
}