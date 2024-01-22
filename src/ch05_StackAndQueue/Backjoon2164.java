package ch05_StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon2164 {

    // 1~N 까지 N장의 카드

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> myQueue = new LinkedList<Integer>();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        int next;
        while (myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        System.out.println(myQueue.poll());
    }
}
