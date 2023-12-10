
import java.util.Arrays;
import java.util.Scanner;

class EQUALIS {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int tc = scanner.nextInt();
       while (tc-->0){
           int number = scanner.nextInt();
           if (number%2==0){
               System.out.println("NO");
           }else {
               System.out.println("YES");
               int [] array = arrayForm(number);
               for (int i=0;i< array.length;i++){
                   System.out.print(array[i] + " ");
               }

           }

       }
    }
    static int [] arrayForm(int number){
        int [] array = new int[number];
        for (int i=0;i< array.length/2;i++) {
            array[i] = i+1;
        }
        int j =0;
        for (int i = array.length/2;i< array.length;i++){
            array[i] = array.length -j;
            j++;
        }
        return  array;
    }
}
