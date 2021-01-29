package chapter1_3;

import java.util.Stack;

public class Evaluate {
    /**
     * 双栈算数表达式求值
     * designed by E.W.Dijkstra
     * 简化版：未省略括号
     * @param str
     * @return
     */
    private static double calculate(String str) {
        String[] strs = str.split(" ");
        Stack<String> ops = new Stack<>(); // 操作符栈
        Stack<Double> vals = new Stack<>(); // 数字栈
        for (String s : strs) {
            if (s.equals("(")) ;
            else if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/") ||
                    s.equals("sqrt") ) {
                ops.push(s);
            }
            else if (s.equals(")")) {
                // 在遇到右括号时弹出一个运算符，弹出所需数量的数字，并将运算符和数字的运算结果压入操作数栈
                // --->
                // 其实，该<u>运算结果代替了括号内表达式的值</u>
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String str = "( 7 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        System.out.println(calculate(str));
    }
}
