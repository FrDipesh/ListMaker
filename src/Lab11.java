import java.util.ArrayList;
import java.util.Scanner;

public class Lab11 {
    static ArrayList<String> listMaker = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        listMaker.add("Husky");
        listMaker.add("Tasty Sweets");
        listMaker.add("Game");
        listMaker.add("The Code");
        listMaker.add("Rose");
        listMaker.add("TV Shows");
        listMaker.add("Creamy Mac and Cheese");
        listMaker.add("Top School");
        listMaker.add("Type Stuff");
        listMaker.add("Home");


        String addItem = InputHelper.getNonZeroLenString(scan,"Enter a word your want to add to the list: ");
        listMaker.add(addItem);
    }




}
