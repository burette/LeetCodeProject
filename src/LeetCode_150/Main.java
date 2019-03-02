package LeetCode_150;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] tokens = new String[]{"2","1","+","3","*"};
        int result = solution.evalRPN(tokens);
        System.out.println(result);
    }
}
