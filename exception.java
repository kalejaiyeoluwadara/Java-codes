import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            try{
               System.out.println("Enter whole number to divide: ");
               int x = sc.nextInt();
               System.out.println("Enter whole number to divide: ");
               int y = sc.nextInt();
               int z = x/y;
           }
           catch(ArithmeticException e){
               System.out.println("You can not divide by 0"+e);
           }
           catch(Exception e){
               System.out.println("Something went wrong: " + e);
           }
            finally {
                System.out.println("Done!");
                sc.close();
           }

        }
        }