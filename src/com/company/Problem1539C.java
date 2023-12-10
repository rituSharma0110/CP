package com.company;
import java.util.*;

public class Problem1539C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        long k = scanner.nextLong(); // additional students
        long x = scanner.nextLong();
        Long [] array = new Long[length];
        ArrayList<Long> list = new ArrayList<>();
        for (int i =0;i<length;i++){
            array [i] = scanner.nextLong();
        }
        Arrays.sort(array);
        int cnt =1;
        for (int i =1;i<length;i++){
            if (array[i]-array[i-1]>x){
                list.add((array[i] - array[i-1] ));
                cnt++;
            }
        }

        Collections.sort(list);

        for (int i =0;i< list.size();i++){
            long var =  ((list.get(i)-1)/x);
            if (var<=k){
                cnt--;
                k-=var;
            }else {
                break;
            }

        }

        System.out.println(cnt);

    }
}
