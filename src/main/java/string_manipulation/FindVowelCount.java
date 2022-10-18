/*5. Write a program that will count how many vowels in the given string:
        "roadtosdet"
        Output: 4*/

package string_manipulation;

public class FindVowelCount {
    public static void main(String[] args) {
        int count = 0;
        String word= "roadtosdet";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Total Number of Vowel in 'roadtosdet' : "+count);


    }
}
