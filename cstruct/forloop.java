import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a starting point to print even number: ");
        int start = user.nextInt();
        System.out.println("Enter end point to print even number: ");
        int end = user.nextInt();
        System.out.println("\n");
        for(int i =start;i<=end;i++){
            if(i%2 == 0){
                System.out.print(i);
            }
        }

    }
}