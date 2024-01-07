import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a command, to exit type 'Quit': ");
        String command = user.nextLine();
        while(!command.equals("Quit")){
            System.out.println(">>> " + command + " <<<");
            System.out.print("Enter a command, to exit type 'Quit': ");
            command = user.nextLine();
        }

        System.out.println("Programme has been exited");

        user.close();
    }
}