package MilestonePrac;
import java.util.*;
public class SumOfIndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array: ");
        String s = sc.nextLine();
        String[] arrString = s.split("\\s+");
        int len = arrString.length;
        int arr[] = new int[len];
        try{
            for(int i = 0; i < len; i++){
                arr[i] = Integer.parseInt(arrString[i]);
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid Input");
            return;
        }
        // arr ready

        System.out.println("Enter a target ele: ");
        int search = sc.nextInt();
        sc.nextLine(); // enter


        int sum = method(arr, search);
        System.out.println("Summation of index: " + sum);
    }
    public static int method(int[] arr, int search){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                sum += i;
            }
        }
        return sum;
    }

}
