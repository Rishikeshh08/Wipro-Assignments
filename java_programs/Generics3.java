//with generics and without generics



public class Generics3 {
    public static void main(String[] args) {
        Store<Integer> s1 = new Store<>(123); // Generic
        Store<String> s2 = new Store<>("Biscuit");
        s1.print();
        s2.print();

        Int_Box i = new Int_Box(44); // w/o generic
        i.print();

        String_Box s = new String_Box("Honey");
        s.print();
    }
}

//with generics
class Store<T> {
    T varia;

    Store(T tostore) {
        varia = tostore;
    }

    void print() {
        System.out.println("It stored : " + varia);
    }
}


//without generics
class Int_Box {
    int item;

    Int_Box(int i) {
        item = i;
    }

    void print() {
        System.out.println("It stored : " + item);
    }
}

class String_Box {
    String item;

    String_Box(String i) {
        item = i;
    }

    void print() {
        System.out.println("It stored : " + item);
    }
}