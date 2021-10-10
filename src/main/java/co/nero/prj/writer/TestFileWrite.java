package co.nero.prj.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class TestFileWrite {
	public static void main(String[] args) {
		File file = new File("D:\\TextTest.txt");
		FileWriter writer = null;

		try {
			writer = new FileWriter(file, true);
			writer.write("ABCE");
			writer.flush();
			System.out.println("실행되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
