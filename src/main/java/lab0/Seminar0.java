package lab0;



/**
 * Created by Bohdan on 15.02.2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seminar0 {
    public static final String EXIT_COMMAND = "exit";

    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some text, or '" + EXIT_COMMAND + "' to quit");

        while (true) {

            System.out.print("> ");
            String input = br.readLine();
            System.out.println(input);

            if (input.length() == EXIT_COMMAND.length() && input.toLowerCase().equals(EXIT_COMMAND)) {
                System.out.println("Exiting.");
                return;
            }

            System.out.println("...response goes here...");
        }
    }
}
