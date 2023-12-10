package com.company;
import java.util.*;

public class Problem1555B {
    static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            int wMin = scanner.nextInt();
            int hMin = scanner.nextInt();
            int wMax = scanner.nextInt();
            int hMax = scanner.nextInt();
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int moveUp = Math.max(h-hMin, 0);
            if (moveUp+hMax > H) {
                moveUp = Integer.MAX_VALUE;
            }
            int moveDown = Math.max(h-(H-hMax), 0);
            if (moveDown > hMin) {
                moveDown = Integer.MAX_VALUE;
            }
            int moveRight = Math.max(w-wMin, 0);
            if (moveRight+wMax > W) {
                moveRight = Integer.MAX_VALUE;
            }
            int moveLeft = Math.max(w-(W-wMax), 0);
            if (moveLeft > wMin) {
                moveLeft = Integer.MAX_VALUE;
            }
            int minMove = Math.min(Math.min(moveUp,moveDown), Math.min(moveLeft,moveRight));
            if (minMove == Integer.MAX_VALUE) {
                minMove = -1;
            }
            System.out.println(minMove);
        }

    }
}
