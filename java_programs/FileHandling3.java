/*
 * rename a file
 * move a file
 * copy a file
 */

import java.io.*;
import java.nio.file.*;
public class FileHandling3 {
    public static void main(String[] args) {
        try{
            // File file = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\sampFile.txt");
            // if(file.createNewFile()){
            //     System.out.println("File created");
            // }else{
            //     System.out.println("File already exists");
            // }

            
            // Path source = Paths.get("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\sampFile.txt");
            // Path destination = Paths.get("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\sampFile.txt");
            
            // // move
            // Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            // System.out.println("File moved successfully");

            // // copy
            // Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            // System.out.println("File moved successfully");

            // rename - make sure file1 exists and file2 doesnt exists,
            // renameTo(File des) = it doesn't uses Path obj , instead uses the file obj
            // file1.createNewFile() - requires try catch , 
            // file1.renameTo(file2) - doesnt reqire try catch as it returns boolean true or false
            File file1 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\sampFile1.txt");
            if(file1.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
            File file2 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\sampFile2.txt");
            

            boolean res = file1.renameTo(file2);
            if(res){
                System.out.println("File Renamed ");
            } else {
                System.out.println("Failed to rename");
            }
            


            // renameTo() - to move file - make sure file3 exists and file4 doesnt exists,
            // File file3 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\sampFile3.txt");
            // if(file3.createNewFile()){
            //     System.out.println("File created");
            // }else{
            //     System.out.println("File already exists");
            // }
            // File file4 = new File("C:\\Users\\rishi\\OneDrive\\Documents\\Rishikesh\\Wipro\\Practice\\programs\\sampFile3.txt");
            

            // boolean res1 = file3.renameTo(file4);
            // if(res1){
            //     System.out.println("File Renamed ");
            // } else {
            //     System.out.println("Failed to rename");
            // }

            

        }catch(IOException e){
            System.out.println("Exception Occured");
        }
    }
}
