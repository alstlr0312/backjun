package backjun;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class zero {
    public static void main(String[] args)  throws IOException {//10773
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int k =  Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < k; i++) {
            int a = Integer.parseInt(br.readLine());

            if(a == 0) {
                stack.pop();
            }
            else {
                stack.push(a);
            }
        }
        for(int o : stack) {
            sum += o;
        }

        System.out.println(sum);

    }
}
