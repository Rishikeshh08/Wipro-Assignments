public class Generics {
    public static void main(String[] args) {
        Box box = new Box();
        
        box.setItem(3);     //int
        box.displayItem();
        
        box.setItem("Rishi");
        box.displayItem();

        box.setItem(3.4);
        box.displayItem();

        box.setItem(5.5f);
        box.displayItem();
    }
}
//with generics
class Box<T>{
    T item;
    void setItem(T item){
        this.item = item;
    }
    void displayItem(){
        System.out.println("Item: " + item);
    }
}


/* 
//without generics
class Box{
    int item;
    void intItem(int item){
        this.item = item;
    }
    void stringItem(String item){
        this.item = item;
    }

}
*/