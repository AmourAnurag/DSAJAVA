//minimum traversal required for balanace the open and close bracket

import java.util.Stack;

public class L59 {

    //first method time complexity O(n)
    static void balanceTheBracket(String st){
        if (st.length()%2!=0) {
            System.out.println("String cannote be balanced ");
            return;
        }
        int ans=0,open=0,close=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if (ch=='{') {
                open++;
            }else{
                if (open<=0) {
                    close++;
                }else{
                    open--;
                }
            }
        }
        ans=(int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
        System.out.println("Total number of traversal "+ans);
        return;
    }

    //second method time complexity O(n+k)
    static void balanaceBracket(String st){
        if (st.length()%2!=0) {
            System.out.println("String cannote be balanced ");
            return;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if (ch=='{') {
                stack.push(ch);
            }else{
                if (stack.isEmpty() || stack.peek()=='}') {
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        int ans=0,open=0,close=0;
        while(!stack.isEmpty()){
            char top=stack.pop();
            if (top=='{') {
                open++;
            }else{
                close++;
            }
        }
        ans=(int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
        System.out.println("Total number of traversal "+ans);
        return;
    }

    public static void main(String[] args) {
       String str="}{{}}{{{";
    //    balanceTheBracket(str);
    balanaceBracket(str);
    }
}
