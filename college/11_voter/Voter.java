import java.time.LocalDate;

public class Voter extends Person {
    public Voter(int id, String name, String gender, LocalDate dateOfBirth) {
        super(id, name, gender, dateOfBirth);
    }
}

class InvalidVoterException extends Exception {
    public InvalidVoterException(String message) {
        super(message);
    }
}
