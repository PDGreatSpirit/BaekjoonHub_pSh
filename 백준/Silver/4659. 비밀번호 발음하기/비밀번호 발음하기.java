import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String password = sc.nextLine();
            if (password.equals("end")) {
                break;
            }

            if (isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }

        sc.close();
    }

    public static boolean isAcceptable(String password) {
        // 조건 1: 모음(a, e, i, o, u) 하나를 반드시 포함하여야 한다.
        if (!containsVowel(password)) {
            return false;
        }

        // 조건 2: 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
        if (hasThreeConsecutiveSameType(password)) {
            return false;
        }

        // 조건 3: 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
        if (hasDoubleConsonant(password)) {
            return false;
        }

        return true;
    }

    public static boolean containsVowel(String word) {
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasThreeConsecutiveSameType(String word) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            if (vowelCount >= 3 || consonantCount >= 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDoubleConsonant(String word) {
        for (int i = 1; i < word.length(); i++) {
            char prev = word.charAt(i - 1);
            char current = word.charAt(i);
            if (prev == current && !(prev == 'e' && current == 'e') && !(prev == 'o' && current == 'o')) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
