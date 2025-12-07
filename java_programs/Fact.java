public class Fact {
    static int book_count;
    String name;
    String author;
    double price;

    Fact(String name,String author,double price) {
        this.name = name;
        this.author= author;
        this.price=price;
        book_count++;
    }
    public static void displayBook(){
        System.out.println(book_count);
    }
    public static void main(String[] args) {
        Fact book1 = new Fact("aa", "df", 34);
        Fact book2 = new Fact("vsd", "dfsd", 45);
        Fact book3 = new Fact("vsd", "dfsd", 45);
        Fact book4 = new Fact("vsd", "dfsd", 45);
        Fact.displayBook();
        System.out.println(Fact.book_count);
    }
}
