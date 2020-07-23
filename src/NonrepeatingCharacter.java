import java.util.*;
import java.io.*;

class Main {

    public static String NonrepeatingCharacter(String str) {

        String[] character = str.split("");
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (character[i].equals(character[j]) && i != j) {
                    str = "No results";
                    break;
                } else if (j == length - 1) {
                    return str = character[i];
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.print("Enter word: ");
        Scanner s = new Scanner(System.in);
        System.out.print("First non repeated letter is: " + NonrepeatingCharacter(s.nextLine()));
    }
}
