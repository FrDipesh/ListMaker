import java.util.ArrayList;
import java.util.Scanner;

public class InputHelper {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> listMaker = new ArrayList<String>();

    private static void AddMethod() {
        String addToList;

        System.out.println("Do you to add anything on the list? [Y/N]");

        if (scan.hasNextLine()) {
            addToList = scan.nextLine();
            if (addToList.equalsIgnoreCase("y")) {

            }
        }
    }

}
