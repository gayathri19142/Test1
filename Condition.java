import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeatCondition = true;
        while (repeatCondition) {
            System.out.println("Playing current song");
            System.out.println("Do you want to repeat");
            String userInput = input.next();
            if (userInput.equals("yes")) {

            } else {
                System.out.println("Play Next song");
                System.out.println("Test Git");
                repeatCondition = false;
            }
        }

    }
}
