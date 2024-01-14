package array_and_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon11720 {

    public static void main(String[] args) {

        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        // 해당 size의 배열을 만들고, String을 int로 바꾸어서 더함
        int num = scanner.nextInt();

        int sum = 0;
        String sNum = scanner.next();
        char[] arrNum = sNum.toCharArray();

        for(int i = 0 ; i< num;i++){
            sum += arrNum[i]-'0';
        }
        System.out.println(sum);
    }
}
