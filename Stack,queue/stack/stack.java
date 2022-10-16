package stack;

import java.util.Stack;
import java.util.Scanner;
public class stack
{
    Stack <String> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    public stack()
    {
        while(true){
            System.out.println("1. 현재상태 보기 2. push 3. pop 4.peek 5.isempty 6.종료");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println(st);
                    break;
                case 2:
                    String str_input = sc.next();
                    push(str_input);
                    break;
                case 3:
                    pop();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    isempty();
                    break;
                case 6:
                    System.exit(1);
                    System.out.println("finished");
                    break;
            }
        }
    }
    public void push(String str_input){
        st.push(str_input);
    }
    public void pop(){
        st.pop();
    }
    public void peek(){
        System.out.println(st.peek());
    }
    public void isempty(){
        System.out.println(st.isEmpty());
    }
}
