package ch07_greedy;

import java.util.Scanner;

public class Backjoon11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 코인 수
        // total 총 가격
        int n = sc.nextInt();
        int total = sc.nextInt();

        int[] coinArr = new int[n];

        for(int i = 0; i < n; i++){
            coinArr[i] = sc.nextInt();
        }

        // 끝 점
        int index = n-1;
        int count =0;

        while(total >0){
            if(total >= coinArr[index]){
                total = total - coinArr[index];
                count++;
            }
            else{
                index--;
            }
        }
        System.out.println(count);
    }

}
