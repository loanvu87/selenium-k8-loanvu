package lab_06;

import java.util.ArrayList;
import java.util.List;

public class DigitCharactersExtract {

    public static void main(String[] args) {
        String myString = "12345nabc678";
        List<Character> characterList = new ArrayList<>();
        characterList = extractDigitCharacters(myString);
        getDigitCharacterString(characterList);
    }

    public static List extractDigitCharacters(String myString) {
        char[] myCharacters = myString.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char character : myCharacters) {
            if (Character.isDigit(character)) {
                characterList.add(character);
            }
        }
        return characterList;
    }

    public static void getDigitCharacterString(List characterList) {
        String digitCharacterString = "";
        for (int index = 0; index < characterList.size(); index++) {
            digitCharacterString += characterList.get(index);
        }
        System.out.print("Digit charater String is: ");
        System.out.println(digitCharacterString);
    }
}
