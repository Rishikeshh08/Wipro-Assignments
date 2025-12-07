import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        try{
            File file = new File("firstFile.txt");
            FileWriter writer = new FileWriter("firstFile.txt");
            // writer.write("Written first line in my firstFile created using File class in java.");
            // writer.write("line 2");
            // writer.close();
            // System.out.println("File written successfully");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("line1");
            bw.write("hehe");
            bw.append("Appending something");
            bw.newLine();
            bw.write("line2");
            bw.close();

            FileReader reader = new FileReader(file);
            // int i;
            // while((i = reader.read()) != -1){
            //     System.out.print((char)i);
            // }
            // reader.close();
            
            BufferedReader br = new BufferedReader(reader);
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();




        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}
