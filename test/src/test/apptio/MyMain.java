package test.apptio;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

	public static void main(String[] args) {
		
		//Node n = new Node(2);
		MyLinkedList list = new MyLinkedList();

		list.add(4);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(9);
		list.add(1);
		list.add(10);
		
		list.printMe();
		
		List<Integer> one = new ArrayList<>();
		one.add(3);
		one.add(8);
		one.add(4);
		one.add(5);
		one.add(6);
		
		List<Integer> two = new ArrayList<>();
		two.add(1);
		two.add(9);
		two.add(7);
		two.add(2);

//		int[] x = new int[] {5,8,4,3,6};
//		int[] y = new int[] {1,9,7,2};
		
		int[] x = new int[] {3,4,5,6,8};
		int[] y = new int[] {1,2,7,9};
		
		int xLen = x.length;
		int yLen = y.length;
		int maxLen = Math.max(x.length, y.length);

		for (int i=0, j=0; i+j < maxLen; ) {
			
		}
	}

}
