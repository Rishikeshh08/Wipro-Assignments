import java.io.*;

class PPerson implements Serializable{
    private String name;
    private int age;
    PPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    

}
public class SerializationDeserialization {
    
    public static void main(String[] args) {
        PPerson p1 = new PPerson("Rishi", 22);
        try{
            //serialization
            FileOutputStream fos = new FileOutputStream("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.close();
            fos.close();

            p1.setName("Atharv");
            System.out.println("Before Deserialization");
            System.out.println("Name: " + p1.getName());
            System.out.println("Age: " + p1.getAge());

            //Deserialization
            FileInputStream fis = new FileInputStream("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            PPerson resP = (PPerson) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("After Deserialization");
            System.out.println("Name: " + resP.getName());
            System.out.println("Age: " + resP.getAge());
            



        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception Occured");
        }
    }
}
