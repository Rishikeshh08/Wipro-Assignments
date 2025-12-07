/*1. Implement these methods with HashMap
2. Count how many times each word appears in a given string.
 Input: "What a beautiful day it is with a beautiful weather"
3. Find all characters that appear more than once in a string.
 Input: "programming". Output: {r=2, g=2, m=2}
4. Given a map {3=Banana, 1=Apple, 2=Cherry}, Sort it: 1. by keys 2. by values
5. Merge two maps and if a key exists in both, add their values. 
Map1 = {a=10, b=20, c=30}. Map2 = {b=15, c=25, d=35}. Output = {a=10, b=35, c=55, d=35} */

import java.util.*;
public class HashMapPractics {
    public static void main(String[] args) {
        // que2("what a beautiful day it is with a beautiful weather");

        // que3("programming");

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(2, "Cherry");
        
        que4(map);



        Map<Character, Integer> m1 = new LinkedHashMap<>();
        Map<Character, Integer> m2 = new LinkedHashMap<>();
        m1.put('a', 10);
        m1.put('b', 20);
        m1.put('c', 30);

        m2.put('b', 15);
        m2.put('c',25);
        m2.put('d', 35);

        que5(m1, m2);
    }

    public static void que5(Map<Character, Integer> m1, Map<Character, Integer> m2){
        Map<Character, Integer> newmap = new LinkedHashMap<>();

        for(Map.Entry<Character, Integer> x : m1.entrySet()){
            newmap.put(x.getKey(), x.getValue());
        }
        for(Map.Entry<Character, Integer> x : m2.entrySet()){
            newmap.put(x.getKey(), newmap.getOrDefault(x.getKey(), 0) + x.getValue());
        }
        System.out.println("Result: " + newmap);
    }

    public static void que4(Map<Integer, String> map){
        System.out.println("Original: " + map);

        Map<Integer, String> treemap = new TreeMap<>(map);
        System.out.println("Sorted by keys: " + treemap);

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> x, Map.Entry<Integer, String> y){
                return (x.getValue().compareTo(y.getValue()));
            }
        });
        Map<Integer, String> sortbyvalue = new LinkedHashMap<>();
        for(Map.Entry<Integer, String> x : list){
            sortbyvalue.put(x.getKey(), x.getValue());
        }
        System.out.println("Sort by values: " + sortbyvalue);
        
    }

    public static void que3(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i <= s.length()-1; i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        System.out.println(hm);
        // for(int i = 0; i <= s.length()-1; i++){
        //     char ch = s.charAt(i);
        //     if(hm.containsKey(ch) && hm.get(ch) <= 1){
        //         hm.remove(ch);
        //     }
        // }
        HashMap<Character, Integer> res = new HashMap<>();
        for(Map.Entry<Character, Integer> entryobj : hm.entrySet()){
            if(entryobj.getValue() >= 2){
                res.put(entryobj.getKey(), entryobj.getValue());
            }
        }
        System.out.println(res);
    }


    public static void que2(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i <= s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println(hm);
    }
}


//day6-1
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println("List before sort: " + list);
        Collections.sort(list);
        System.out.println("List after sort: " + list);
    }
}




//day6-2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Test<Integer> t1 = new Test<Integer>();
                t1.add(30, 20);
                break;
            case 2:
                Test<Double> t2 = new Test<Double>();
                t2.add(10.0, 20.0);
                break;
            case 3:
                Test<Float> t3 = new Test<Float>();
                t3.add(20.0f, 20.0f);
                break;
        }
    }
}

class Test<T extends Number> {
    void add(T a, T b) {
        System.out.println("the sum is = " + (a.doubleValue() + b.doubleValue()));
    }
}

// day6 - 3
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnhancedLibraryManagementSystem {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int ch = scanner.nextInt();
    	if(ch==1)
    	{
        Library<Book> bookLibrary = new Library<>();
        int n = scanner.nextInt();
        for(int i=1;i<=n ;i++ )
        {
        	int id = scanner.nextInt();
        	scanner.nextLine();
        	String name = scanner.nextLine();
        	String author = scanner.nextLine();
        	int numpages = scanner.nextInt();
        	Book book = new Book(id,name,author,numpages);
        	bookLibrary.addItem(book);
        }
        bookLibrary.displayItems();
    	}
    	
        else if(ch==2)
    	{
        Library<DVD> dvdLibrary = new Library<>();
         int n = scanner.nextInt();
        for(int i=1;i<=n ;i++ )
        {
        	int id = scanner.nextInt();
        	scanner.nextLine();
        	String name = scanner.nextLine();
        	String author = scanner.nextLine();
        	int duration = scanner.nextInt();
        	DVD dvd = new DVD(id,name,author,duration);
        	dvdLibrary.addItem(dvd);
        }
            	
        Library<Magazine> magazineLibrary = new Library<>();
        
         n = scanner.nextInt();
        for(int i=1;i<=n ;i++ )
        {
        	int id = scanner.nextInt();
        	scanner.nextLine();
        	String name = scanner.nextLine();
        	String author = scanner.nextLine();
        	int issueno = scanner.nextInt();
        	Magazine magazine = new Magazine(id,name,author,issueno);
        	magazineLibrary.addItem(magazine);
        }
        dvdLibrary.displayItems();
        magazineLibrary.displayItems();
    	}
   
    	else if(ch==3) {
    		  Library<Book> bookLibrary = new Library<>();
    	        int n = scanner.nextInt();
    	        for(int i=1;i<=n ;i++ )
    	        {
    	        	int id = scanner.nextInt();
    	        	scanner.nextLine();
    	        	String name = scanner.nextLine();
    	        	String author = scanner.nextLine();
    	        	int numpages = scanner.nextInt();
    	        	Book book = new Book(id,name,author,numpages);
    	        	bookLibrary.addItem(book);
    	        }
    	        
    	
        // Checking out and returning items
        int itemId = scanner.nextInt();
        
        if( bookLibrary.checkOutItem(itemId))
        {
        	System.out.println("Item " + itemId + " checked out successfully.");
        }
        else
        {
        	 System.out.println("Item " + itemId + " not found in the library.");
        }
      
               
    	}

    	else if(ch==4)
    	{     
        	           
            Library<Magazine> magazineLibrary = new Library<>();
            
            int n = scanner.nextInt();
            for(int i=1;i<=n ;i++ )
            {
            	int id = scanner.nextInt();
            	scanner.nextLine();
            	String name = scanner.nextLine();
            	String author = scanner.nextLine();
            	int issueno = scanner.nextInt();
            	Magazine magazine = new Magazine(id,name,author,issueno);
            	magazine.checkedOut= true;
            	magazineLibrary.addItem(magazine);
            }
          
        int 
        itemId = scanner.nextInt();
              
          
        if(magazineLibrary.returnItem(itemId))
        {
        	System.out.println("Item " + itemId + " returned successfully.");
        }
        else
        {
        	System.out.println("Item " + itemId + " not found in the library.");
        }
      
    	}
    
    }
}

class LibraryItem {
    private int itemId;
    private String title;
    private String creator;
    public boolean checkedOut;

  
    public LibraryItem(int itemId, String title, String creator) {
    	//write your code here
        this.itemId = itemId;
        this.title = title;
        this.creator = creator;

    }
    
    // define getter methods for itemId, title and creator
    public int getItemId(){
        return itemId;
    }
    public String getTitle(){
        return title;
    }
    public String getCreator(){
        return creator;
    }
    
   public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
       //implement code and throw an exception if item already checked out
       try{
            if(!checkedOut){
                checkedOut = true;
            } else {
                // String s = "Item " + itemId + " is already checked out";
                throw new ItemAlreadyCheckedOutException();
            }
       }
       catch(ItemAlreadyCheckedOutException e){
           System.out.println("Item " + itemId + " is already checked out");
       }
    }

    public void returnItem() {
        //implement  code and also throw an exception if item is not checked out
        try{
            if(checkedOut){
                checkedOut = false;
            } else{
                throw new ItemNotCheckedOutException();
            }
        } catch(ItemNotCheckedOutException e){
            System.out.println("Item " + itemId + " is not checked out");
        }

    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nCreator: " + creator + "\nChecked Out: " + checkedOut;
    }
}

// create and define custom classes of exceptions
public class ItemNotCheckedOutException extends RuntimeException{
    ItemNotCheckedOutException(){
        super();
    }
}
public class ItemAlreadyCheckedOutException extends RuntimeException{
    ItemAlreadyCheckedOutException(){
        super();
    }
}


class Book extends LibraryItem {
    private int numPages;
 
    // define parameterized constructor with 4 arguments  : int itemId, String title, String author, int numPages
    Book(int itemId, String title, String author, int numPages){
        super(itemId, title, author);
        this.numPages = numPages;
    }

    public int getNumPages(){
        return numPages;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Book\nNumber of Pages: " + numPages;
    }
}

class DVD extends LibraryItem {
    private int duration; // in minutes

    // define parameterized constructor with 4 arguments int itemId, String title, String director, int duration
    public DVD(int itemId, String title, String director, int duration){
        super(itemId, title, director);
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }
    @Override
    public String toString() {
        return super.toString() + "\nType: DVD\nDuration: " + duration + " minutes";
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

  
    // define parameterized consturcor with 4 arguments : int itemId, String title, String publisher, int issueNumber
    Magazine(int itemId, String title, String publisher, int issueNumber){
        super(itemId, title, publisher);
        this.issueNumber = issueNumber;
    }
   
   public int getIssueNumber(){
        return issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Magazine\nIssue Number: " + issueNumber;
    }
}

class Library<T extends LibraryItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
            System.out.println("-------------");
        }
    }

    public boolean checkOutItem(int itemId) {
    	// write your code here
        for(T item : items){
            if(item.getItemId() == itemId){
                item.checkOut();
                return true;
            }
        }
    	return false;
    }

    public boolean returnItem(int itemId) {
        // write your code here
        for(T item : items){
            if(item.getItemId() == itemId){
                item.returnItem();
                return true;
            }
        }
    	return false;
    }

    private T findItem(int itemId) {
        // write your code here
        for(T item : items){
            if(item.getItemId() == itemId){
                return item;
            }
        }
    	return null;
    }
}

// que 4
import java.util.Scanner;

// Java program to remove

// elements from HashMap

import java.io.*;

import java.util.*;

public class Main {

public static void main(String[] args) {

Scanner s=new Scanner(System.in);

A

//write your answer here

Map<Integer, String> map = new HashMap<>();

int size = 4;

for(int i = 0; i <= size-1; i++){

}

map.put(i+1, s.next());

int keys.nextInt();

System.out.println("Mappings of HashMap are: "+ map);

map.remove(key);
System.out.println("Mappings after removal are : + map);

}
}




//que5
import java.util.*;

class TargetSum{

static int[] twoSum(int n, int[] nums, int target) {

//write your answer here

int res[] = new int[2];

for(int i = 0; i<n-1; i++){

for(int j = 0; j < n-1; j++){

if((nums[i] + nums[j]) == target){

res[0] = i;

res[1] = j;

return res;

}

}

}


return res;

}
public static void main (String[] args) {

Scanner in = new Scanner(System.in);

int n = in.nextInt();

int arr[] = new int[n];

for(int i=0;i<n;i++)

arr[i] = in.nextInt();

int target in.nextInt();

int[] ans twoSum(n,arr, target);

System.out.println("("+ans [0]+", "+ans [1]+")");

}
}


