// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {


    }

    public static int countDeci(String r) {
        if (r.length() == 0) {
            return 0;
        } else {
            char currentChar = r.charAt(0);
            int deciCount = isDeci(currentChar) ? 1 : 0;
            return deciCount + countDeci(r.substring(1));

        }

    }

    public static boolean isDeci(char c) {
        return c >= '0' && c <= '9';

    }
}






