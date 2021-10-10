package co.nero.prj.writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TestFileCopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String onetext = "D:\\TextTest.txt";
		String copytext = "D:\\TextTest2.txt";
		
		File one = new File(onetext);
		File copy = new File(copytext);
		
		try {
			FileInputStream fis = new FileInputStream(onetext);
			FileOutputStream fos = new FileOutputStream(copytext);
			
			int fileByte = 0 ;
			while((fileByte = fis.read()) != -1) {
				fos.write(fileByte);
			}
			
			fis.close();
			fos.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
				
	}

}
