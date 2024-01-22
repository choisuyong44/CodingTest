package ch00_basic.string;

import java.util.Scanner;

public class Backjoon2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복 횟수
        int iter = sc.nextInt();

        // char 반복
        int n;

        // Array 생성
        char[] strArr;
        for(int i =0;i<iter;i++){
            n = sc.nextInt();
            // String 받기
            String s = sc.next();
            strArr = s.toCharArray();

            for(int j =0; j<s.length();j++){
                int count =0;
                while(count < n){
                    System.out.print(strArr[j]);
                    count++;
                }
            }
            System.out.println();
        }
    }
}
