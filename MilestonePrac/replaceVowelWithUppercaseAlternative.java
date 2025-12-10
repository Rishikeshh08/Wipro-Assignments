package MilestonePrac;


public class replaceVowelWithUppercaseAlternative {
    public static void main(String[] args) {
        method("hello world");
        
    }
    public static void method(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i <= s.length()-1; i++){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch) != -1){
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        System.out.println(sb.toString());

    }
}

