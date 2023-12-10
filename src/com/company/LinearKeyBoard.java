package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LinearKeyBoard {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String keyType = scanner.next();

            String string= scanner.next();
            int ans = 0;
            if (keyType.equals("abcdefghijklmnopqrstuvwxyz")) {
                for (int i = 0; i < string.length(); i++) {
                    for (int j = i; j < string.length() - 1; j++) {
                        ans = ans + (int) (Math.abs(string.charAt(j + 1) - string.charAt(j)));
                        break;
                    }
                }
            }else {
//                char[] array = keyType.toCharArray();
//                ArrayList<Integer> list = new ArrayList<>();
//                for (int i =0;i<50;i++) {
//                    for (int j = 0; j < keyType.length(); j++) {
//                        if (array[i] == string.charAt(i)){
//                            list.add(j);
//                            break;
//                        }
//                    }
//                }
//                System.out.println(list);
//                for (int i =0;i< list.size()-1;i++){
//                    ans = ans + Math.abs(list.get(i+1)- list.get(i));
//                }
//            }
                for (int i =0;i<string.length()-1;i++){
                    ans = ans + Math.abs(keyType.indexOf(string.charAt(i+1))- keyType.indexOf(string.charAt(i)));
                }
            }
            System.out.println(ans);
        }
    }
}
