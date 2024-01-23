package ch07_greedy;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Backjoon1931 {

    public static void main(String[] args) {
        /*한 개의 회의실 여러 개의 팀이 사용*/
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // n개 팀의 start와 end -> 0 ,1
        int[][] intArr = new int[n][2];
        int[] interval = new int[n];
        for(int i =0;i<n;i++){
            intArr[i][0] = sc.nextInt();
            intArr[i][1] = sc.nextInt();
            interval[i] = intArr[i][1] - intArr[i][0];
        }

        boolean[] realTime = new boolean[12];
        Arrays.fill(realTime,true);

        // realtime이 true 이고, 가장 차이가 작은 것 뽑기



    }
}
