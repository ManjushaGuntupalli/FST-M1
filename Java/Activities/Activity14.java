package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) {
		try {
            File file = new File("Activity14.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
            	FileUtils.write(file, "Hello World", "utf-8", true);
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
 
            //get the file Object
            File fileUtil = FileUtils.getFile("Activity14.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
 
            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);
 
            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "Activity14.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);

	}

	}
}
