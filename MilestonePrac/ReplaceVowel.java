package MilestonePrac;
import java.util.*;
public class ReplaceVowel {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String scannedString = sc.nextLine();
        String replacedString = method(scannedString);
        System.out.println("replaced String : " + replacedString);

    }
    public static String method(String s){
        
        String res = s.replaceAll("[aeiouAEIOU]", "*");
        return res;
    }
}
