package MilestonePrac;

import java.util.*;

public class AvgNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eleStr = sc.nextLine();

        String[] eleArr = eleStr.split("\\s+");  // one or more space

        // int len = eleArr.length;
        // int[] intEleArr = new int[len];
        // try{
        //     for(int i = 0; i <= len-1; i++){
        //         intEleArr[i] = Integer.parseInt(eleArr[i]);
        //     }
        // }
        // catch(Exception e){
        //     System.out.println("Invalid");
        //     return;
        // }
        


        double avg = method(eleArr);
        System.out.println("Average : " + avg);

    }
    public static double method(String[] arr){
        double sum = 0;
        try{
            for(int i = 0; i <= arr.length-1; i++){
                sum += Integer.parseInt(arr[i]);
            }
        }
        catch(Exception e){
            System.out.println(" Invalid ");
        }
        return (sum / arr.length);
    }
}
