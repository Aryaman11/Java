import java.util.*;

class WellFormed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        String result = wellFormed(test);
        System.out.println(result);
    }

    public static String wellFormed(String test){

        Stack<Character> st = new Stack<>();
        for(int i=0;i<test.length();i++){
            char chr = test.charAt(i);
            if(st.empty()){
                st.push(chr);
            }else if(chr == '{' || chr == '[' || chr == '('){
                st.push(chr);
            }else if(chr== '}' || st.peek() == '{'){
                st.pop();
            }else if(chr== ']' || st.peek() == '['){
                st.pop();
            }else if(chr== ')' || st.peek() == '('){
                st.pop();
            }
        }
        if(st.size() == 0){
            return "this is a well formed string.";
        }else{
            return "this is not a well formed string.";
        }

    }
}