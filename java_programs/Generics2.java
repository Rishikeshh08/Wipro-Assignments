/*
without generics - 
used Object - it can be Integer , String
problem - we need to write code for creating multiple objects of class Box - intBox , stringBox
we can reduce this extra code using generics
*/

public class Generics2 {
    public static void main(String[] args) {

        
        Box intBox = new Box();
        intBox.setItem(123);  // Autoboxing Integer # Object is class which is inheriting String, 

        
        Box strBox = new Box();
        strBox.setItem("Hello");

        
        Integer num = (Integer) intBox.getItem();  
        String str = (String) strBox.getItem();   

        
        System.out.println("Integer: " + num);
        System.out.println("String: " + str);
        String wrong = (String) intBox.getItem();  
        

        // String wrong = (String) intBox.getItem();  // ClassCastException
    }
}
// Box class without generics
class Box {
    private Object item;  

    
    public void setItem(Object item) {
        this.item = item;
    }

    
    public Object getItem() {
        return item;
    }
}

