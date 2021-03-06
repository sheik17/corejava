package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileHand {
	public static void create() {
		File obj = new File("D:\\New folder\\sheik.txt");
		boolean present = obj.exists();
		if (present == false) {
			try {
				boolean created = obj.createNewFile();
				System.out.println("File Created" + created);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Already file created");
		}
	}

	public static void rename() {
		File oldName = new File("D:\\New folder\\sheik.txt");
		File newName = new File("D:\\New folder\\java.txt");
		if (oldName.renameTo(newName)) {
			System.out.println("Renamed");
		} else {
			System.out.println("Already change the File name");
		}
	}

	public static void appendDataToFile() throws IOException {
		FileWriter fr = new FileWriter("D:\\New folder\\java.txt");
		BufferedWriter br = new BufferedWriter(fr);
		br.write("data");
		br.close();
		fr.close();
		System.out.println("data append in file");
	}

	public static void modifyDataInFile() throws IOException {
		FileWriter f = new FileWriter("D:\\New folder\\java.txt");
		try {
			FileWriter filewriter = new FileWriter("D:\\New folder\\java.txt");
			filewriter.write("one");
			filewriter.close();
			System.out.println("Modify the file");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public static void ReadDataFromFile() {
		try {
			File myObj = new File("D:\\New folder\\java.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("File reading: " + data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

	public static void delete() {

		File file = new File("D:\\New folder\\java.txt");

		if (file.delete()) {
			System.out.println("File deleted");
		} else {
			System.out.println("Failed to delete the file");
		}
	}

	public static void move() throws IOException {
		Path temp = Files.move(Paths.get("D:\\New folder\\java.txt"),
				Paths.get("D:\\New folder\\New folder\\java.txt"));
		if (temp != null) {
			System.out.println("moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}

		public static void copy() throws IOException {
			FileSystem fileSys = FileSystems.getDefault();
			Path srcPath = fileSys.getPath("D:\\WIN_20220505_16_50_22_Pro.mp4");
			Path destPath = fileSys.getPath("C:\\app\\WIN_20220505_16_50_22_Pro.mp4");
			try {
				// TO COPY file1.txt from source to destination folder
				Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("file copied");
			} catch (IOException ioe) {
				System.out.println("file not copy");
			}
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create();
		// rename();
	//	appendDataToFile();

//		 modifyDataInFile();
		// ReadDataFromFile();
		// delete();
		// move();
		 copy();
	}
}
