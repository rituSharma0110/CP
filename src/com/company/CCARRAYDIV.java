
import java.util.Scanner;

 class CCARRAYDIV {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            boolean isSorted = isSort(array);
            int sum =0;
            if (isSorted){
                sum+=Math.abs(array[size-1]-array[0]);
                for (int i =1;i< array.length-2;i++){
                    sum+=Math.abs(array[i+1]-array[i]);
                }
            }else {
                for (int i =0;i< array.length-1;i++){
                    sum+=Math.abs(array[i+1]-array[i]);
                }
            }
            System.out.println(sum);
        }
    }
    static boolean isSort(int [] array){
        boolean isSorted = true;
        for (int i =0;i< array.length-1;i++){
            if (array[i]>array[i+1]){
                isSorted= false;
                break;
            }
        }
        return isSorted;
    }
}
