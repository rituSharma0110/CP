package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Problem1428C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            Stack<Character> stack = new Stack<>();
            for(char ch:str.toCharArray())
            {
                if(stack.isEmpty())
                    stack.push(ch);
                else if(ch=='B' && stack.peek()=='A')
                {
                    stack.pop();
                }
                else  if(ch=='B' && stack.peek()=='B')
                    stack.pop();
                else
                    stack.push(ch);
            }

            System.out.println(stack.size());

        }
    }
}
