package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
//		List - ArrayList, LinkedList
		
//		ArrayList a = new ArrayList();	// 비추~
//		ArrayList<Object> a = new ArrayList<>();
		ArrayList<?> a = new ArrayList<>();
		
		ArrayList<String> b = new ArrayList<String>();	// 권장
		ArrayList<String> c = new ArrayList<>();	// 생략 가능
//		ArrayList<int> d = new ArrayList<>();		// 원시형 불가능, 참조형만가능
		ArrayList<Integer> d = new ArrayList<>();	// 
		LinkedList<String> e = new LinkedList<>();
//		최종형태
		List<String> f = new ArrayList<>();
		List<String> g = new LinkedList<>();
		
		
	}

}
