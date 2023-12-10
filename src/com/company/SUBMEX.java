
import java.util.Scanner;

 class SUBMEX {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int arrLength = scanner.nextInt();
            int k = scanner.nextInt();
            int x = scanner.nextInt();
            int [] array = new int[k];
            if (x>k ){
                System.out.println(-1);
            }else {
                while (arrLength!=0){
                    for (int i =0;i<x;i++){
                        array[i]=i;
                        arrLength--;
                        if (arrLength==0){
                            break;
                        }
                    }
            }
                for (int i =0;i<array.length;i++){
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
