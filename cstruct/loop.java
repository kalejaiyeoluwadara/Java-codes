import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner gamer = new Scanner(System.in);
        Random rand = new Random();
        int userGuess;
        int guess = rand.nextInt(10);
        int limit  = 3;

        do{
            System.out.print("Guess a number between 1 and 10: ");
            userGuess = gamer.nextInt();
            if (userGuess == guess){
                System.out.println("Wooww! you won.");
                break;
            }
            else if(userGuess > guess){
                System.out.println("Ur guess is higher");
                System.out.println("Try again");
            }
            else if(userGuess < guess){
                System.out.println("Ur guess is lower");
                System.out.println("Try again");
            }

            limit -=1;
        }while(limit > 0);
        if(limit == 0){
            System.out.println("The guess was: " + guess);
            System.out.println("Game Over!!");
        }
    }
}