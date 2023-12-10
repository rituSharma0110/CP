
import java.util.Scanner;

 class CCHOSTEL {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int total = scanner.nextInt();
            int initial = scanner.nextInt();
            int [] array = new int[total];
            for (int i =0;i<total;i++) {
                array[i] = scanner.nextInt();
            }
            int max = initial;
            for (int i =0;i< array.length;i++){
                initial+=array[i];
                if (initial>max){
                    max=initial;
                }
            }
            System.out.println(max);
        }
    }
}
