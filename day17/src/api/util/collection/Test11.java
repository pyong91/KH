package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> nameList = new ArrayList<>();
		List<String> todoList = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			nameList.add(sc.next());
		}
		
		for (int i = 0; i < 3; i++) {
			todoList.add(sc.next());
		}
		Collections.shuffle(todoList);
		
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i) + " -> ");
			System.out.print(todoList.get(i));
			System.out.println();
		}
	}

}
