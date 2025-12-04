import java.util.ArrayList;
import java.util.Scanner;

public class InputHelper {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> listMaker = new ArrayList<String>();


    // [Y/N] question
    public static String getYNConfirm(Scanner scan, String prompt) {
        boolean validYN = false;
        String question= "";

        System.out.println(prompt);
        do {
            if (scan.hasNextLine()) {
                question = scan.nextLine();
                if (question.equalsIgnoreCase("y")) {
                    validYN = true;
                } else if (question.equalsIgnoreCase("n")) {
                    validYN = true;
                } else {
                    System.out.println("Invalid Please pick [Y] or [N]");
                }
            }
        } while (!validYN);
        return question;
    }

    public static String addMethod(Scanner scan, String prompt){
        boolean validAdd = false;
        String yes = "";
        String addToList;

        System.out.println(prompt);
        do {
            if (scan.hasNextLine()) {
                addToList = scan.nextLine();
                if (yes.equalsIgnoreCase("y")) {
                    listMaker.add(addToList);
                    validAdd = true;
                }
                System.out.println("Enter a valid input: ");
            }
        } while (!validAdd);
        return yes;
    }

}
