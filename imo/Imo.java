import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent party details
class Party {
    String name;

    // Constructor to initialize the Party object with a name
    public Party(String name) {
        this.name = name;
    }
}

// Class to represent electorate details
class Electorate {
    String uniqueID;

    // Constructor to initialize the Electorate object with a unique ID
    public Electorate(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}

// Class to manage the voting system
class VotingSystem {
    List<Party> parties = new ArrayList<>();
    List<Electorate> electorates = new ArrayList<>();

    // Method to register a new party
    public void registerParty(String partyName) {
        Party newParty = new Party(partyName);
        parties.add(newParty);
        System.out.println("Party '" + partyName + "' registered successfully.");
    }

    // Method to register a new electorate
    public void registerElectorate(String uniqueID) {
        // Check if the electorate with the same ID already exists
        for (Electorate electorate : electorates) {
            if (electorate.uniqueID.equals(uniqueID)) {
                System.out.println("Electorate with ID '" + uniqueID + "' already registered.");
                return;
            }
        }

        Electorate newElectorate = new Electorate(uniqueID);
        electorates.add(newElectorate);
        System.out.println("Electorate with ID '" + uniqueID + "' registered successfully.");
    }

    // Method for casting votes
    public void castVote(String uniqueID, String partyName) {
        // Check if the electorate with the given ID exists
        Electorate electorate = null;
        for (Electorate e : electorates) {
            if (e.uniqueID.equals(uniqueID)) {
                electorate = e;
                break;
            }
        }

        if (electorate == null) {
            System.out.println("Electorate with ID '" + uniqueID + "' not found.");
            return;
        }

        // Find the party with the given name
        Party votedParty = null;
        for (Party party : parties) {
            if (party.name.equals(partyName)) {
                votedParty = party;
                break;
            }
        }

        if (votedParty == null) {
            System.out.println("Party '" + partyName + "' not found.");
            return;
        }

        // Display congratulatory message
        System.out.println("Congratulations! You voted for '" + votedParty.name + "'.");
    }
}

// Main class for the program
public class Imo {
    public static void main(String[] args) {
        // Create an instance of the VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Voting System!");

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Register a Party");
            System.out.println("2. Register an Electorate");
            System.out.println("3. Cast a Vote");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Register a new party
                    System.out.print("Enter the name of the party: ");
                    String partyName = scanner.next();
                    votingSystem.registerParty(partyName);
                    break;
                case 2:
                    // Register a new electorate
                    System.out.print("Enter the unique ID for the electorate: ");
                    String electorateID = scanner.next();
                    votingSystem.registerElectorate(electorateID);
                    break;
                case 3:
                    // Cast a vote
                    System.out.print("Enter your electorate ID: ");
                    String voteElectorateID = scanner.next();

                    System.out.print("Enter the party you want to vote for: ");
                    String votePartyName = scanner.next();

                    votingSystem.castVote(voteElectorateID, votePartyName);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the Voting System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
