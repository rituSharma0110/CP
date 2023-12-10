
import java.util.Scanner;

public class SquaresAndCubes {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc --> 0) {
            int number = scanner.nextInt();
            int result =0;
            result+= Math.floor(Math.sqrt(number));
            result+= Math.floor(Math.cbrt(number));
            result-= Math.floor(Math.sqrt(Math.cbrt(number)));
            System.out.println(result);

        }
    }
}
