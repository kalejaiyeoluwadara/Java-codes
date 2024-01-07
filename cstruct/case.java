
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        char grade;
        //Grade detector using switch statement

        System.out.println("Enter your score: ");
        int score = user.nextInt();
        switch(score/10){
            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'B';
                break;
            case 5:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            case 3:
                grade = 'P';
                break;
            case 2:
                grade = 'E';
                break;
            default:
                grade = 'F';
                System.out.println("Score not identified.");


        }
        System.out.println( "Your grade is: "+grade);
    }
}