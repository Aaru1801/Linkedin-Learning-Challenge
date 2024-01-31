import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String question = "Where do you put the code in java?";
        String optionA = "src";
        String optionB = "lib";
        String optionC = "bin";

        String correctAnswer = optionA;

        System.out.println(question);

        System.out.println("Choose one of the following: " +
                optionA + ", " + optionB + ", or " + optionC + ".");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats that is the right answer!");
        } else {
            System.out.println("Aw I am sorry you are not correct. The correct answer is " + correctAnswer);
        }
    }
}