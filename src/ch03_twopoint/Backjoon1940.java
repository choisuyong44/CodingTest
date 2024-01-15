package ch03_twopoint;

import java.util.Scanner;

public class Backjoon1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = scanner.nextInt();
        }

        int count = 0;
        int base = 0;
        int offset = 0;
        /*             조건
             base >= n : break;
             base < n :
                 base+offset >= n :base++, offset = 1
                 base+offset < n :
                     nArr[base] + nArr[base+offset] == m:
                         count++; base++, offset = 1 숫자는 모두 고유하다고 했음.*/
        while (base < n) {
            if (base + offset >= n) {
                base++;
                offset = 1;
            } else {
                if (nArr[base] + nArr[base + offset] == m) {
                    count++;
                    base++;
                    offset = 1;
                } else {
                    offset++;
                }
            }
        }
        System.out.println(count);
    }
}
