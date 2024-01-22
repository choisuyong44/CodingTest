package ch05_StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Backjoon1874 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        // 입력 받기
        for(int i =0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        // stack 생성
        Stack<Integer> stack = new Stack<Integer>();
        
        // top = 1
        int num =1;
        StringBuffer bf = new StringBuffer();

        boolean result = true;
        
        // stack에 넣어주기
        for(int i=0;i <A.length;i++){
            int su = A[i];
            if(su >=num){
                while(su>=num){
                    stack.push((num++));
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else{
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
