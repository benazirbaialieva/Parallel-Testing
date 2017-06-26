package ocaPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcaPrep1 {

	public static void main(String[] args) {

		//System.out.println("Hello, World!");
		int [] i = new int[4];
		i[0] = 5;
		i[1] = 2;
		i[2] = 23;
		i[3] = 1;
		//Arrays.sort(i);
		System.out.println(Arrays.binarySearch(i, 23));
		List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("ok");
		System.out.println(list.indexOf("ok"));
		
		
	}
	
	

}







