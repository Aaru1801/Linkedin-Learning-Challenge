import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String question = "Where do you put the code in java?";
        String choiceOne = "src";
        String choiceTwo = "lib";
        String choiceThree = "bin";

        String correctAnswer = choiceOne;

        System.out.println(question);

        System.out.println("Choose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats that is the right answer!");
        } else {
            System.out.println("You are not correct. The correct answer is " + correctAnswer);
        }
    }
}