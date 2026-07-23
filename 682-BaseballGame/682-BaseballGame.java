// Last updated: 7/23/2026, 9:33:52 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String i : operations){
            if(i.equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else if(i.equals("C")){
                stack.pop();
            }
            else if(i.equals("D")){
                stack.push(2*stack.peek());
            }
            else{
                stack.push(Integer.parseInt(i));
            }
        }
        int total = 0;
        for(int val : stack){
            total += val;
        }
        return total;
    }
}