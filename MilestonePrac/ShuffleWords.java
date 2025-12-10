package MilestonePrac;

import java.util.Scanner;

public class ShuffleWords {
    public static void main(String[] args) {
        // String string = "Hello World Welcome to Java";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String string = sc.nextLine();
        String result = shuffle(string);
        System.out.println("Shuffled String: "+ result);
    }
    public static String shuffle(String s){
        
        String[] words = s.split(" ");  // ("//s+"), for vowel = ("(?i)[aeiou]")
        int len = words.length;
        int rotation = len / 2;
        // 0 = 2
        // 1 = 3
        // 2 = 4
        // 3 = 0
        // 4 = 1
        String[] res = new String[len];
        for(int i = 0; i <= len-1; i++){
            res[i] = words[(i+rotation) % len];
        }
        return String.join(" " , res);


    }
}
