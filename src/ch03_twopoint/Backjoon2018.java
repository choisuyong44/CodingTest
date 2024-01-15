package ch03_twopoint;

import java.util.Scanner;

public class Backjoon2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int sum = 0, count = 0;

        for (int base = 1; base <= target; base++) {
            sum = 0;
            for (int j = base; j <= target; j++) {
                if (sum > target) {
                    break;
                } else if (sum == target) {
                    count++;
                    break;
                } else {
                    sum += j;
                }
            }

        }
        count++;
        System.out.println(count);
    }
}
