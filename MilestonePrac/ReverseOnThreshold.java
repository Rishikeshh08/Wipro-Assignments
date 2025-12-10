package MilestonePrac;

import java.util.*;
public class ReverseOnThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sen = sc.nextLine();
        System.out.println("Enter Threshold: ");
        int threshold = 0;
        if(sc.hasNextInt()){
            threshold = sc.nextInt();
            sc.nextLine(); // enter 
        }else{
            sc.nextLine();
            System.out.println("Invalid Theshold");
            return;
        }
        
        if(sen.length() > threshold){
            String rev = method(sen);
            System.out.println("Rev: "+ rev);
        }else{
            System.out.println("Threshold is less: " + sen);
        }
        
    }
    public static String method(String sen){
        return new StringBuilder(sen).reverse().toString();
    }
}
