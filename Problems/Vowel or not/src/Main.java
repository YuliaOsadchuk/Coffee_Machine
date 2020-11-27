import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean vowel = false;
        char[] letter = new char[]{'a', 'e', 'u', 'o', 'i', 'A', 'E', 'U', 'I', 'O'};
        for (char c : letter) {
            if (ch == c) {
                vowel = true;
                break;
            }
        }
        return vowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}