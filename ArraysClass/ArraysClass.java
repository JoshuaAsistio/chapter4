import java.util.*;
import javax.swing.*;

public class ArraysClass {
    public static void main(String[] args) {
        String[] menuChoices = new String[10];
        String currEntry = "", menuString = "";
        int x = 0;
        int numEntered;
        int highestSub = menuChoices.length - 1;

        // fills the array with zzz values
        Arrays.fill(menuChoices, "zzzzzzz");

        // gets input of dishes from the user
        menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu or zzz to quit");

        // as long as the user did not type in zzz, the program will ask he user for input
        while (!menuChoices[x].equals("zzz") && x < highestSub) {
            menuString = menuString + menuChoices[x] + "\n";
            x++;

            // highest sub is the limit
            if (x < highestSub) {
                menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu or zzz to quit");
            }
        }

        numEntered = x;

        // asks the user's order
        currEntry = JOptionPane.showInputDialog(null, "Today's menu is:\n" + menuString +"Please make a selection");

        // sorts array for search
        Arrays.sort(menuChoices, 0, numEntered);

        // looks up the user's order to make sure the order is on the menu.
        x = Arrays.binarySearch(menuChoices, currEntry);

        if (x >= 0 && x < numEntered) {
            JOptionPane.showMessageDialog(null, "Excellent choice");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, that item is not on the menu.");
        }

    }
}