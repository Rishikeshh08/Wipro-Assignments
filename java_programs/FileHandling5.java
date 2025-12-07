//merge content of 2 files in 3rd file alternatly (1 line from 1st file 2nd line from 2nd file)

import java.io.*;
public class FileHandling5 {
    public static void main(String[] args) {
        try{
            File file1 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\file1.txt");
            if(file1.createNewFile()){
                System.out.println("File created successfully");
            } else{
                System.out.println("file already exists");
            }
            FileWriter fw1 = new FileWriter(file1);
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write("line1 file1");
            bw1.newLine();
            bw1.write("line2 file1");
            bw1.newLine();
            bw1.write("line3 file1");
            bw1.close();
            fw1.close();



            File file2 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\file2.txt");
            if(file2.createNewFile()){
                System.out.println("File created successfully");
            } else{
                System.out.println("file already exists");
            }
            FileWriter fw2 = new FileWriter(file2);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.write("line1 file2");
            bw2.newLine();
            bw2.write("line2 file2");
            bw2.newLine();
            bw2.write("line3 file2");
            bw2.newLine();
            bw2.write("line4 file2");
            bw2.newLine();
            bw2.write("line5 file2");
            bw2.close();
            fw2.close();

            File file3 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\merged.txt");
            if(file3.createNewFile()){
                System.out.println("File created successfully");
            } else{
                System.out.println("file already exists");
            }


            
            FileReader fr1 = new FileReader(file1);
            BufferedReader br1 = new BufferedReader(fr1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br2 = new BufferedReader(fr2);
            FileWriter fw3 = new FileWriter(file3);
            BufferedWriter bw3 = new BufferedWriter(fw3);
            boolean flag = false;
            String s1;
            String s2;
            while(!flag){
                int count = 0;
                if((s1 = br1.readLine()) != null){
                    bw3.write(s1);
                    bw3.newLine();
                    count++;
                }
                if((s2 = br2.readLine()) != null){
                    bw3.write(s2);
                    bw3.newLine();
                    count++;
                }
                flag = (count == 0) ? true : false;
            }
            bw3.close();
            fw3.close();
            br2.close();
            fr2.close();
            br1.close();
            fr1.close();
            System.out.println("Merged Successfully");

        }catch(IOException e){
            System.out.println("exception occured");
        }
    }
}
