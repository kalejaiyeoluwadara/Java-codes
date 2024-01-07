import java.util.Scanner;
public class Bank{
    public float balance = 50000;
    public String welcome(String user_name){
        System.out.println(user_name + " welcome to public java Bank.");
        return null;
    }
     public String welcome(){
        System.out.println("Your balance is " + balance);
        System.out.println("Thanks for you patronage.");
        return null;
    }
    public String withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How much would you like to withdraw: ");
        float amt = sc.nextInt();
        if(amt > balance){
            System.out.println("Insufficient funds");

        }
        else{
            balance -=amt;
            System.out.println("You have successfully withdrawn #" + amt);
        }
        return null;
    }
    public static void main(String args[]){
        Bank bank = new Bank();
        bank.welcome("dara");
        bank.withdraw();
        bank.welcome();
    }
}