
import java.util.Scanner;

 class ClosingTheGap {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int sum =0;
            for (int i = 0; i < array.length; i++) {
                sum+= array[i];
            }

            if (sum% array.length==0){
                System.out.println(0);
            }else System.out.println(1);


        }
    }


}
