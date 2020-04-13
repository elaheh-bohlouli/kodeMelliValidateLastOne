import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            ValidateConditions validateConditions = new ValidateConditions();
            Scanner scanner = new Scanner(System.in);
            String givenNumber = scanner.next();
            try {
                validateConditions.validateNumber(givenNumber);
            } catch (ValiditationException e) {
                e.printStackTrace();
            }
        }
}
