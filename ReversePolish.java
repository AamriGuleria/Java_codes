public class ReversePolish {
    public int evalRPN(String[] tokens) {
        ArrayList<String> list=new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        return evaluate(tokens,list);
    }
    public static int calculate(String op,int a,int b){
        if(op.equals("+")){
            return a+b;
        }
        else if(op.equals("-")){
            return a-b;
        }
        else if(op.equals("*")){
            return a*b;
        }
        else{
            return a/b;
        }
    }
    public static int evaluate(String[] tokens,ArrayList<String> list){
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!list.contains(tokens[i])){
                stk.push(Integer.valueOf(tokens[i]));
            }
            else{
                int b=stk.pop();
                int a=stk.pop();
                System.out.println(a+" "+b);
                stk.push(calculate(tokens[i],a,b));
            }
        }
        return stk.pop();
    }
}
