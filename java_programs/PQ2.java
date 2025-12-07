import java.util.*;
public class PQ2 {
    public static void main(String[] args) {
        // armstrong no. from 1 to 10000
        // armstrongNo();

        // 1st non repeating character
        // que2("atharvat");

        // int a = 5;int b = 4; int c = 3;
        // int max = (a > b) 
        //             ? ((a > c) ? a : c)
        //             : ((b > c) ? b : c);
        // System.out.println("Max: " + max);
        

        // %4 
        // int year = 1000;
        // if((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
        //     System.out.println("leap year");
        // }else{
        //     System.out.println("Not a leap year");
        // }

        // char ch = '4';
        // int t = ch;
        // if(t >= 65 && t <= 90){
        //     System.out.println("Uppercase");
        // }
        // else if(t >= 97 && t <= 122){
        //     System.out.println("Lowercase");
        // }
        // else if(t >= 48 && t <= 57){
        //     System.out.println("Number");
        // }
        // else{
        //     System.out.println("Symbol");
        // }

        int a = 2; int b = 2; int c = 4;
        String ans = (a == b) ? ((b == c) ? "All Equal" : "Two equal") : ((b == c) ? "Two Equal" : "All Different");
        System.out.println(ans);
    }
    public static void armstrongNo(){
        for(int i = 1; i <= 10000; i++){
            int num = i;
            int n = i;
            int sum = 0;
            // count no of digits
            int count = String.valueOf(num).length();
            while(n != 0){
                int rem = n % 10;
                sum += Math.pow(rem, count);
                n /= 10;
            }
            if(num == sum){
                System.out.println("No " + num + " is Armstrong Number");
            }
        }
    }
    public static void que2(String s){
        char target = ' ';
        Map<Character , Integer> map = new LinkedHashMap<>();
        for(int i = 0; i <= s.length()-1; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                target = entry.getKey().charValue();
                break;
            }
        }
        System.out.println((target == ' ' ? "No non repeating char" : ("1st non repeating char: " + target)));
    }
}
