package ch00_basic.string;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon5622 {

    public static void main(String[] args) {

        // String 받기
        // 1 -> 2초, 2-> 3초 ..

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] chArray = s.toCharArray();
        Arrays.sort(chArray);

        int sum =0;
        for(int i=0;i<s.length();i++){
            if (chArray[i] < 'P') {
                // (알파벳 순서(0부터 25까지) / 3) + 2
                sum += (int)(chArray[i]-'A') / 3 + 3;
            }

            else{
                if(chArray[i] < 'T'){
                    sum += 8;
                }
                else if('T'<= chArray[i] && chArray[i] <= 'V'){
                    sum += 9;
                }
                else{
                    sum+= 10;
                }
            }
        }
        System.out.println(sum);
    }
}
