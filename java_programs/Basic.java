import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        System.out.println("original: "+ arr);
        ArrayList<Integer> resultantArrayList = removeDuplicates(arr);
        System.out.println("que 1 ans: "+ resultantArrayList);
        // Iterator<Integer> itr = resultantArrayList.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("is");
        list2.add("fun");
        System.out.println("que2 original: " + list2);
        ArrayList<String> res = reverseOrderofListAndString(list2);
        System.out.println("que2 ans: " + res);
        

    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> newarr = new ArrayList<>();
        for(int x : arr){
            if(!newarr.contains(x)){
                newarr.add(x);
            }
        }
        Collections.sort(newarr);
        return newarr;
    }

    public static ArrayList<String> reverseOrderofListAndString(ArrayList<String> list2){
        Collections.reverse(list2);
        for(String s : list2){
            StringBuilder sb = new StringBuilder(s);
            StringBuilder sb2 = sb.reverse();
            System.out.println(sb2);
            String str = sb.toString();
            System.out.println(str);
            list2.set(i, str);
        }
        return list2;
    }
}

