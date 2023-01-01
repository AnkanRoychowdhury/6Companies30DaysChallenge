package Microsoft;

import java.util.Stack;

/**
 * QuesNo1
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 */
public class Ques_No_1 {

    public static void main(String[] args) {

        String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
        
    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
        if (token.equals("+")) {
            int operand1 = stack.pop();
            int operand2 = stack.pop();
            stack.push(operand2 + operand1);
        } else if (token.equals("-")) {
            int operand1 = stack.pop();
            int operand2 = stack.pop();
            stack.push(operand2 - operand1);
        } else if (token.equals("*")) {
            int operand1 = stack.pop();
            int operand2 = stack.pop();
            stack.push(operand2 * operand1);
        } else if (token.equals("/")) {
            int operand1 = stack.pop();
            int operand2 = stack.pop();
            stack.push(operand2 / operand1);
        } else {
            stack.push(Integer.parseInt(token));
        }
        }
        
        return stack.pop();
        
    }

    
}