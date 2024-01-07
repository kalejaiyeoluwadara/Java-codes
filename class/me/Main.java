// Abstract class representing an 18-year-old boy named Dara
 abstract class Dara {
    private String name;
    private String hobby;

    // Constructor
    public Dara(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    // Abstract method for my unique behavior
    public abstract void greet();

    // Getter methods
    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }
}

// Subclass representing my son
class Son extends Dara {
    private boolean codesForFun;

    // Constructor
    public Son(String name, String hobby, boolean codesForFun) {
        super(name, hobby);
        this.codesForFun = codesForFun;
    }

    // Implementation of the abstract method
    @Override
    public void greet() {
        System.out.println("Hey, I'm " + getName() + ". Nice to meet you!");
    }

    // Additional method specific to my Son
    public void codesForFun() {
        if (codesForFun) {
            System.out.println(getName() + " loves coding for fun .");
        } else {
            System.out.println(getName() + " doesn't love coding for fun.");
        }
    }
}

// Subclass representing my daughter 
class Daughter extends Dara {
    private boolean likesReading;

    // Constructor
    public Daughter(String name, String hobby, boolean likesReading) {
        super(name, hobby);
        this.likesReading = likesReading;
    }

    // Implementing my abstract method
    @Override
    public void greet() {
        System.out.println("Hi, I'm " + getName() + ". Nice to meet you!");
    }

    // Additional method specific to my Daughter
    public void readBooks() {
        if (likesReading) {
            System.out.println(getName() + " enjoys reading books.");
        } else {
            System.out.println(getName() + " is not much into reading.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of my son
        Son daraSon = new Son("Dele", "Playing Guitar", true);

        // Using members of the Son class
        daraSon.greet();
        daraSon.codesForFun();
        System.out.println("Hobby: " + daraSon.getHobby());

        System.out.println("-----------------------"); 

        // Creating an instance of my daughter
        Daughter daraDaughter = new Daughter("Bola", "Drawing", true);

        // Using members of the Daughter class
        daraDaughter.greet();
        daraDaughter.readBooks();
        System.out.println("Hobby: " + daraDaughter.getHobby());
    }
}
