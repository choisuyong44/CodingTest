package ch00_basic.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Backjoon1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count =0;
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()){
            count++;
            st.nextToken();
        }
        System.out.println(count);
    }
}
