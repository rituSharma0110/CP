
import java.util.Scanner;

 public class Problem1472A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      int tc = scanner.nextInt();
      while (tc-->0){
          int n = scanner.nextInt();
          int [] array = new int[n];
          for(int i=0;i<n;i++){
              array[i] = scanner.nextInt();
          }
          long sum =0;
          for (int i =0;i<n;i++) {
              sum += array[i]-1;
          }
          if (sum%2==0){
              System.out.println("maomao90");
          }else  System.out.println("errorgorn");

      }
    }
}
