package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test05 {

	public static void main(String[] args) throws Exception {
		List<File> list = new ArrayList<>();

		for (char c = 'A'; c < 'Z'; c++) {
			File drive = new File(c + ":\\");
			if (drive.exists()) {
				list.add(drive);
			}
		}
		for (File file : list) {
			System.out.println(file.getAbsolutePath());
		}
		
		
		File[] list2 = File.listRoots();
		Set<File> set = new HashSet<>(Arrays.asList(list2));
		
		for(File drive : list2) {
			System.out.println(drive.getAbsolutePath());
			Thread.sleep(1000L);
		}
	}
}
