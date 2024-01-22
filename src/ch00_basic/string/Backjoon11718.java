package ch00_basic.string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while((s =bf.readLine()) != null){
            System.out.println(s);
        }
    }
}
