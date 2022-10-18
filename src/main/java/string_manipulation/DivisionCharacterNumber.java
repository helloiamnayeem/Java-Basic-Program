/*
4. Writea program that will give following output:
        Input: chattogram
        Output: C8M
*/

package string_manipulation;

public class DivisionCharacterNumber {

    public static void main(String[] args) {

        String division="chattogram";
        int index;

        String firstIndex = String.valueOf(division.charAt(0)).toUpperCase();
        String secondIndex = String.valueOf(division.charAt(9)).toUpperCase();

        index = division.lastIndexOf('a');

        String result = firstIndex + index + secondIndex;

        System.out.println("Expected Output for chattogram: " +result);

    }
}