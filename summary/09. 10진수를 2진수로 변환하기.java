// tip: each public class is put in its own file
import java.util.*; 

public class main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(solution(a));
    }

    public static String solution(int a) {
        String s = "";
        Stack<Integer> stack = new Stack<>();
        for (int i=a; i>0; i/=2) {
            stack.push(i%2);
        }
        
        while (!stack.isEmpty()) {
            s += stack.pop();
        }
        return s; 

    }
}
