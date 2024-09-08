import java.time.LocalDate;
import java.time.Period;

public class Person {
    int id;
    String name;
    String gender;
    LocalDate dateOfBirth;

    public Person(int id, String name, String gender, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public void displayPersonDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Date of Birth: " + dateOfBirth);
    }
}
