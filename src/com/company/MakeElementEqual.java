
import java.util.Scanner;

public class MakeElementEqual {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i=0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int min = minimum(array);
            int max = maximum(array);
            int ans = max - min;
            System.out.println(ans);

        }
    }
     static int maximum(int [] array){
        int max = array[0];
        for (int i =0;i< array.length;i++){
            if (max<array[i]){
                max = array[i];
            }
        }
        return max;
     }
     static int minimum(int [] array){
        int min = array[0];
        for (int i =0;i< array.length;i++){
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
     }

}
