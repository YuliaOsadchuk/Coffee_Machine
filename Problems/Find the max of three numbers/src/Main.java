import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int max;
        int position;
        if (a >= b) {
            max = a;
            position = 1;
        } else {
            max = b;
            position = 2;
        }
        if (max < c) {
            max = c;
            position = 3;
        }

        return position;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}