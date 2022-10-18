/*6. Replace "R" from Rahim with "F" from the given String:
        Input: Ratul and Rahim lives in Rangpur
        Output: Ratul and Fahim lives in Rangpur*/

package string_manipulation;

public class ReplaceStringCharacter {
    public static void main(String[] args) {
        String nameString = "Ratul and Rahim lives in Rangpur";
        char[] chars = nameString.toCharArray();
        chars[10] = 'F';

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            newString.append(chars[i]);
        }

        System.out.println(newString);
    }
}
