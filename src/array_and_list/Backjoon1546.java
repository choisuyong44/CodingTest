package array_and_list;

import java.util.Scanner;

public class Backjoon1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int num, score Arr init
        int num = scanner.nextInt();
        Double[] scoreArr = new Double[num];

        // sum, max set
        double max; double sum = 0;

        // find max
        scoreArr[0] = scanner.nextDouble();
        max = scoreArr[0];
        for(int i = 1;  i< num;i++){
            scoreArr[i] = scanner.nextDouble();
            if(scoreArr[i] >= max){
                max = scoreArr[i];
            }
        }

        // change score
        for(int i = 0 ; i< num;i++){
            sum += (scoreArr[i] / max) * 100;
        }

        System.out.println(sum/num);
    }
}
