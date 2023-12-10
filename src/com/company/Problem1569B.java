package com.company;
import java.util.*;

public class Problem1569B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            char [] array = scanner.next().toCharArray();
            char [][] mat = new char[n][n];
            for (int i =0;i< mat.length;i++){
                for (int j = 0;j< mat.length;j++){
                    mat[i][j]='=';
                }
            }
            for (int i=0;i< array.length;i++){
                mat[i][i]='X';
            }
            int cnt2=0;
            for (int i =0;i< array.length;i++){
                if (array[i]=='2'){
                    cnt2++;
                }
            }
            // 1112 --> not possible as 4th person wants to win the least one game but all others want to win all games
            // 11122--> 4th person can win over 5th but 5th now has not choice except to lose so this case is not possible at all
            if (cnt2==1 || cnt2 ==2){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            ArrayList<Integer> indexList = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if (array[i] == '2')
                    indexList.add(i);
            }
            for(int i = 0;i<indexList.size();i++){
                mat[indexList.get(i)][indexList.get((i+1)%indexList.size())] = '+';
                mat[indexList.get((i+1)%indexList.size())][indexList.get(i)] = '-';
            }
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(mat[i][j]);
                }
                System.out.println();
            }

        }
    }
}
