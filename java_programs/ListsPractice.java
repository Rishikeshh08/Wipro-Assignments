/*
 Q. Implement all these methods and see the outputs.

Q1. Write a Java program to remove duplicate elements from a List without using a Set. 
You should retain the first occurrence of each element. Sort the output in ascending order. 
Input: [10, 30, 20, 20, 10, 30, 20, 40]. Output: [10, 20, 30, 40]

Q2. Given a list of strings, write a program to reverse the order of words in the list and 
also reverse each word itself. Input: ["Java", "is", "fun"] . Output:  ["nuf", "si", "avaJ"]

Q3. Given a list of integers, write a Java program to find the second largest number.

Q4. Merge two lists, remove duplicates, and sort in ascending order.
 List 1: [3, 5, 7, 5] . List 2: [2, 7, 8, 3]. Output : [2, 3, 5, 7, 8]

---------------------------------------------------------------------------------------
 */


import java.util.*;


public class ListsPractice {
    public static void main(String[] args) {
        //que 1
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        // System.out.println("original: "+ arr);
        // ArrayList<Integer> resultantArrayList = removeDuplicates(arr);
        // System.out.println("que 1 ans: "+ resultantArrayList);
        
        //QUE2
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("is");
        list2.add("fun");
        // System.out.println("que2 original: " + list2);
        // ArrayList<String> res = reverseOrderofListAndString(list2);
        // System.out.println("que2 ans: " + res);
        
        //QUE 3
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(10);
        arr3.add(30);
        arr3.add(40);
        arr3.add(20);
        // que3(arr3);


        //que4
        List<Integer> arr41 = new ArrayList<>();
        List<Integer> arr42 = new ArrayList<>();
        arr41.add(3);
        arr41.add(5);
        arr41.add(7);
        arr41.add(5);
        arr42.add(2);
        arr42.add(7);
        arr42.add(8);
        arr42.add(3);
        que4(arr41, arr42);
        
    }

    public static void que4(List<Integer> list1 , List<Integer> list2){
        List<Integer> list = new ArrayList<>();
        for(Integer x : list1){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        for(Integer x : list2){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        list.sort(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a-b;
            }
        });
        System.out.println("Result4: " + list);
    }

    public static void que3(List<Integer> list){
        Collections.sort(list);
        System.out.println("2nd largest ele: " + list.get(1));
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
        System.out.println(list2);
        int n = list2.size();
        for(int i = 0; i <= n-1; i++){
            String s = list2.get(i);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            s = sb.toString();
            list2.set(i, s);
        }
        return list2;
    }
}

