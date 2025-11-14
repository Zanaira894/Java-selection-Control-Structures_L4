import java.util.Scanner;
public class LabTask4d{
     public static void main(String[] args){ 
     Scanner input = new Scanner(System.in);
     System.out.print("Enter three intergers ");
     int A = input.nextInt();
     int B = input.nextInt();
     int C = input.nextInt();
     int min = Math.min(A,Math.min(B,C));
     System.out.println("The smallest value is :" + min);
     }
}
     
