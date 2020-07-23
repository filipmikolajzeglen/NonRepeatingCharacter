import java.util.*;
import java.io.*;

class Main {

    public static String NonrepeatingCharacter(String str) {

        String[] character = str.split("");
        int length = str.length();
        int repeated = 0;

        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length; j++)
            {
                if(i != j) {
                    System.out.print("i = " + i + " letter = " + character[i] + " | ");
                    System.out.println("j = " + j + " letter = " + character[j]);
                }

                if (character[i].equals(character[j]) && i != j)
                {
                    str = "There are not nonrepeat character";
                    System.out.println(str);
                    break;
                }
                else if (!character[i].equals(character[j]) && j == length - 1)
                {
                    str = character[i];
                }
            }
        }
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.print("Enter word: ");
        Scanner s = new Scanner(System.in);
        System.out.print("First non repeat letter is: " + NonrepeatingCharacter(s.nextLine()));
    }

}
