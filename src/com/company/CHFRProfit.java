
import java.util.Scanner;

 class CHFRProfit {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int nofStocks = scanner.nextInt();
            int price = scanner.nextInt();
            int sellingPrice = scanner.nextInt();
            int profit = sellingPrice*nofStocks - price*nofStocks;
            System.out.println(profit);
        }
    }
}
