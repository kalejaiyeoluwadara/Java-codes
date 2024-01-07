import java.util.Scanner;
public class Bus{    
    String name;
    String date;
    int age;
    //first overloaded function
    public String overLoadFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to God is good Motors: ");
        System.out.print("Customer name: ");
        String name = sc.nextLine();
        System.out.print("Customer age: ");
        int age = sc.nextInt();
        System.out.print("Date of travel MM-DD-YY: ");
        String date = sc.nextLine();
        sc.nextLine();
        return null;
    }
    //second overloaded function
    public double overLoadFunc(double baseFare){
        return 0.2 * baseFare;
    }

    public static void main(String args[]){
        Scanner user = new Scanner(System.in);
        Bus bus = new Bus();
        double BASE_FARE = 5000;
        //For customer details
        bus.overLoadFunc();
        // int extraCharge = bus.overLoadFunc(BASE_FARE);
        // System.out.println("Extra Charge: " + extraCharge);
        System.out.println("\n1:Refund\n2.Reschedule.");
        int choice = user.nextInt();
        if(choice == 1){
            System.out.println("Your money has been refunded.");
        }
        else if(choice == 2){
            System.out.println("Your journey has been rescheduled.");
        }
        else{
            System.out.println("Option not found");
        
        }
    }
}