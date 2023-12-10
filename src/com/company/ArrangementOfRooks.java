
import java.util.Scanner;

public class ArrangementOfRooks {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            int rooks = scanner.nextInt();

            if (rooks>(n+1)/2){
                System.out.println(-1);
                continue;
            }else {
                for (int i =0;i<n;i++){
                    boolean place = rooks>0&& i%2==0;
                    if (place) rooks--;
                   for (int j =0;j<n;j++){
                       if (i!=j){
                           System.out.print(".");
                       }else System.out.print(place? "R": ".");
                   }
                    System.out.println();
                }
            }
        }
    }
}
