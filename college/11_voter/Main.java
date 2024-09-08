import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static Voter registerVoter(Person person) throws InvalidVoterException {
        if (person.calculateAge() < 18) {
            throw new InvalidVoterException("Person " + person.name + " is under 18 and cannot register as a voter.");
        }
        return new Voter(person.id, person.name, person.gender, person.dateOfBirth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Person[] persons = new Person[n];
        Voter[] voters = new Voter[n];
        Person[] invalidVoters = new Person[n];

        int voterCount = 0;
        int invalidVoterCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

            persons[i] = new Person(id, name, gender, dateOfBirth);
            try {
                voters[voterCount] = registerVoter(persons[i]);
                voterCount++;
            } catch (InvalidVoterException e) {
                System.out.println(e.getMessage());
                invalidVoters[invalidVoterCount] = persons[i];
                invalidVoterCount++;
            }
        }

        System.out.println("\nList of registered voters:");
        for (int i = 0; i < voterCount; i++) {
            voters[i].displayPersonDetails();
        }
        System.out.println("\nList of invalid voters:");
        for (int i = 0; i < invalidVoterCount; i++) {
            invalidVoters[i].displayPersonDetails();
        }
        scanner.close();
    }
}
