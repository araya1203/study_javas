// backjoon 
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//첫째 줄에 A×B를 출력한다.
//https://www.acmicpc.net/problem/10998
// 3*4 = 12

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = A * B;
        System.out.println(result);
    }
}