package com.company;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
//        if (str1==str2){
//            System.out.println("yes");// string pool concept
//        }else System.out.println("no");
//
//        if (str1.equals(str2)){
//            System.out.println("I am good");
//        }else System.out.println(" Nothing");

//        String str3 = new String("ritu");
//        String str4 = new String("ritu");
//        if (str3==str4){
//            System.out.println("Yes");
//        }else System.out.println("NO");// two different objects are equal only when they are pointing to the same object.
////        to overcome the  above exception , we use equals
//
//        if (str3.equals(str4)){
//            System.out.println("I am good");
//        }else System.out.println(" Nothing");
//
        String string = "a";
        System.out.println(string + 1);//a1

        String newString = " a " + 1;
        System.out.println(newString);// here 1 is converted into wrapper class Integer which will call to string method

        System.out.println((char)('a' +1 ));
        System.out.println((int)('a' + 1));// Integer in nature

        String pal = "abccba";
        StringBuilder sb = new StringBuilder(pal);
        StringBuilder rev = sb.reverse();
        String ans = rev.toString();// converted to string as equals method compares references before the content

        System.out.println(rev);
        if (pal.equals(ans)){
            System.out.println("true");
        }else System.out.println("false");

        String str5 = new String("Hello");
        String str6 = "Hello";
        System.out.println(str5.equals(str6));

    }
}
/* Important points about string
1. String are immutable in nature
2.String Builders are mutable in nature
3. Use string Builders whenever working with strings
 */

