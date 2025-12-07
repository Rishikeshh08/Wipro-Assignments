//count words and lines form 1 file and write that count in other file

import java.io.*;
public class FileHandling4 {
    public static void main(String[] args) {
        try{
            File file1 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\essay.txt");
            if(file1.createNewFile()){
                System.out.println("File Created Successfully");
            } else{
                System.out.println("File already exists");
            }
            FileWriter fw1 = new FileWriter(file1);
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write("line 1 in this file.");
            bw1.newLine();
            bw1.write("Line 2");
            bw1.newLine();
            bw1.write("This is line 3.");
            bw1.close();
            int lines = 0; 
            int words = 0;
            FileReader fr1 = new FileReader(file1);
           BufferedReader br1 = new BufferedReader(fr1);
            String s;
            while((s = br1.readLine()) != null){
                lines++;
                String[] wordsArr = s.split(" ");
                words += wordsArr.length;
            }
            // System.out.println(lines);
            // System.out.println(words);
            br1.close();
            fr1.close();

            File file2 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\report.txt");
            if(file2.createNewFile()){
                System.out.println("File Created Successfully");
            } else{
                System.out.println("File already exists");
            }
            FileWriter fw2 = new FileWriter(file2);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.write("Number of Lines: "+ lines);
            bw2.newLine();
            bw2.write("Number of Words: " + words);
            bw2.close();
            fw2.close();
            System.out.println("Report Generated Successfully");

        } catch(IOException e){
            System.out.println("Exception Caused");
        }

    }
}
