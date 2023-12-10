
import java.util.Arrays;
import java.util.Scanner;

public class CreateARectangle {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int [] array = new int[3];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int max = array[array.length-1];
            if ((max == array[0]+array[1])){
                System.out.println("YES");
            }else if (array[1] == array[2]&& array[0]%2==0)System.out.println("YES");
        else if (array[0] == array[1]&& array[2]%2==0)System.out.println("YES");

        else System.out.println("NO");
        }
    }

}
