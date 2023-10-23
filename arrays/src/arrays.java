import java.util.Arrays;
import javax.swing.*;

public class arrays {    
    public static void main(String[] args) {
    	char[] codes = { 'B', 'E', 'K', 'M', 'P', 'T' };

        String entry = JOptionPane.showInputDialog(null, "Enter a product code");

        char usersCode = entry.charAt(0);

        int position = Arrays.binarySearch(codes, usersCode);

        if (position < 0) {
            JOptionPane.showMessageDialog(null, usersCode + " is an invalid code.");
        } else {
            JOptionPane.showMessageDialog(null, "The " + usersCode + " is at position " + position);
        }
    }
}
