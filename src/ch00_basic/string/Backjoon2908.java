package ch00_basic.string;

import java.util.Scanner;

public class Backjoon2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char[] aChar = a.toCharArray();

        String b = sc.next();
        char[] bChar = b.toCharArray();

        for(int i=2;i >=0;i--){
            if(aChar[i] > bChar[i]){
                for(int j =2;j>=0;j--){
                    System.out.print(aChar[j]);
                }
                break;
            }
            else if(aChar[i] < bChar[i]){
                for(int j =2;j>=0;j--){
                    System.out.print(bChar[j]);
                }
                break;
            }
        }
    }
}
