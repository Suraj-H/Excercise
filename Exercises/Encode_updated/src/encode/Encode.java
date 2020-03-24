package encode;

import java.util.ArrayList;
import java.util.List;

public class Encode {

    public static String encodeString(String inputString) {
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length; ++i) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z' || charArray[i] >= 'a' && charArray[i] <= 'z') {
                int letter = charArray[i];
                letter += 3;
                charArray[i] = (char) letter;
            } else if (charArray[i] == ' ') {
                charArray[i] = '*';
            }
        }

        return String.valueOf(charArray);
    }

    public static String languageString(String inputString) {
        char[] charArray = inputString.toCharArray();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < charArray.length; ++i) {
            characterList.add(charArray[i]);

            if (charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U' ||
                    charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                characterList.add('B');
            } else {
                characterList.add('I');
            }
        }

        char[] tempCharArray = new char[characterList.size()];

        for (int i = 0; i < characterList.size(); ++i) {
            tempCharArray[i] = characterList.get(i);
        }

        return String.valueOf(tempCharArray);
    }
}