/*
 * Q2. Given two lists of integers, find the common elements using a Set. List1: [1, 2, 3, 4], List2: [3, 4, 5, 6].
Output: [3, 4]
Q3. Given a string, count the number of unique words using a Set. Input: "Java is fun and Java is powerful"
Q4. Check if two lists have no elements in common using a Set. List1: [1, 2, 3] List2: [4, 5, 6] Output: true
Q5. Given a string, find the first non-repeating character using a Set. Input: "swiss" Output: "w"
 */



import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(53);
        set1.add(34);
        // System.out.println("Original: "+set1);
        /* 
        set1.remove(34);
        System.out.println(set1);
        System.out.println(set1.contains(4));
        System.out.println(set1.size());   */

        //que2
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        // System.out.println("List1: " + list1);

        //que2
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        // System.out.println("List2: " + list2);

        // List<Integer> reslist = que2(list1, list2);
        // System.out.println("Que2 ans = " + reslist);



        //que3
        String str = "Java is fun and Java is powerfull";
        // int res3 = que3(str);
        // System.out.println("Result3: " + res3);


        //que4
        List<Integer> list41 = new ArrayList<>();
        list41.add(1);
        list41.add(2);
        list41.add(3);

        List<Integer> list42 = new ArrayList<>();
        list42.add(4);
        list42.add(5);
        list42.add(6);

        // boolean res4 = que4(list41, list42);
        // System.out.println("Result4: " + res4);

        //que5
        String str5 = "swiss";
        char res5 = que5(str5);
        System.out.println("Result4: " + ((res5 == ' ') ? "No non repeating word" : res5));
    }

    public static char que5(String s){
        HashSet<Character> set = new HashSet<>();

        
    }

    public static boolean que4(List<Integer> list1, List<Integer> list2){
        HashSet<Integer> set4 = new HashSet<>();
        for(Integer x : list1){
            set4.add(x);
        }
        boolean unique = true;
        for(Integer x : list2){
            if(set4.contains(x)){
                unique = false;
                break;
            }
        }
        return unique;
    }

    public static int que3(String str){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) != ' '){
                hs.add(str.charAt(i));
            }
        }
        return hs.size();
    }

    public static List<Integer> que2(List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(Integer x : list1){
            set.add(x);
        }
        for(Integer x : list2){
            if(set.contains(x)){
                list3.add(x);
            }
        }
        return list3;
    }
}
