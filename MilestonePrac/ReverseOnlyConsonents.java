import java.util.*;
public class ReverseOnlyConsonents {
    public static void main(String[] args) {
        String ans = method("Hello World");
        System.out.println(ans);
    }

    public static String method(String str){
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        // List<Character> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1){  // if consonent
                sb2.append(ch);
            }
        }
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            
            char ch = str.charAt(i);
            if(Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1){
                sb.setCharAt(i, sb2.charAt(sb2.length()-1 - counter) );
                counter++;
            }
        }
        return sb.toString();

    }
}
