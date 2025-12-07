import java.io.*;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) {
        try{
            File file1 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\myfile1.txt");
            // if(file1.createNewFile()){
            //     System.out.println("File Created Successfully");
            // } else{
            //     System.out.println("File already exists");
            // }
            // File file2 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\myfile2.txt");
            // if(file2.createNewFile()){
            //     System.out.println("File Created Successfully");
            // } else{
            //     System.out.println("File already exists");
            // }

            FileWriter fw1 = new FileWriter(file1);
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write("sample line 1.");
            bw1.newLine();
            bw1.write("line 2");
            bw1.close();
            fw1.close();


            FileReader fr1 = new FileReader(file1);
            BufferedReader br1 = new BufferedReader(fr1);
            String s;
            while((s = br1.readLine()) != null){
                System.out.println(s);
            }

            // FileWriter fw2 = new FileWriter(file2);
            // BufferedWriter bw2 = new BufferedWriter(fw2);

            // String s;
            // while((s = br1.readLine()) != null){
            //     bw2.write(s);
            //     bw2.newLine();
            // }

            // br1.close();
            // bw2.close();
            // bw1.close();
        }catch(IOException e){
            System.out.println("Excrption Occured");
        }
    }
}
