package com.company;
import java.util.ArrayList;
import java.util.Scanner;

 public class Problem1546A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        outer:
        while (tc-- > 0) {
            int size = scanner.nextInt();
            int[] arrayA = new int[size];
            int[] arrayB = new int[size];
            int sumA = 0;
            int sumB = 0;
            for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = scanner.nextInt();
                sumA += arrayA[i];
            }
            for (int i = 0; i < arrayB.length; i++) {
                arrayB[i] = scanner.nextInt();
                sumB += arrayB[i];
            }
            if (sumA != sumB) {
                System.out.println(-1);
                continue outer;
            }
            ArrayList<TestPair> pair = new ArrayList<>();
            for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] < arrayB[i]) {
                    for (int j = i + 1; j < arrayB.length; j++) {
                        if (arrayA[j] > arrayB[j]) {
                            arrayA[i]++;
                            arrayA[j]--;
                            pair.add(new TestPair(j + 1, i + 1));
                            if (arrayA[i] == arrayB[i]) {
                                break;
                            }
                            j--;
                        }
                    }
                } else if (arrayA[i] > arrayB[i]) {
                    for (int j = i + 1; j < arrayB.length; j++) {
                        if (arrayA[j] < arrayB[j]) {
                            arrayA[i]++;
                            arrayA[j]--;
                            pair.add(new TestPair(i + 1, j + 1));
                            if (arrayA[i] == arrayB[i]) {
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(pair.size());
            for (int i =0;i<pair.size();i++){
                System.out.println(pair.get(i));
            }

        }
    }
     static class TestPair{
         int i;
         int j;
         public TestPair(int i,int j){
             this.i = i;
             this.j = j;
         }
         public static void print(TestPair testPair){
             System.out.println(testPair);
         }
         public String toString() {
             return i + " " + j;
         }

     }
}
