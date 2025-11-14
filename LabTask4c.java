import java.util.Scanner;
    public class LabTask4c{
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer");
      int x= input.nextInt();
    
      if (x > 0)
         System.out.println(1);
      else if (x < 0)
          System.out.println(-1);
      else 
          System.out.println(0);
      }
    }
          