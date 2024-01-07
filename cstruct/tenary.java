///Java programme, using tenaary to detect if a student carries over a course or not
import java.util.Scanner;
public class Tenary{
    public static void main (String[] args){
        Scanner user = new Scanner(System.in);
        String message;
        System.out.print("Enter score to be detected: ");
        int score = user.nextInt();
        message =  score >= 50 ? "You are not carrying over the course" : "Unfortunately, you are carrying over the course.";
        int i =0;
        System.out.println(i++);
        System.out.println(i);
    }
}