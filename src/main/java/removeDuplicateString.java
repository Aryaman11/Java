import java.util.*;

class Removeduplicate {
    public static void main(String[] args) {
        String test = "programming";
        StringBuilder str = new StringBuilder();
        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i < test.length(); i++) {
            set.add(test.charAt(i));
        }
        for (Character c : set) {
            str.append(c);
        }
        System.out.println(str);

    }
}