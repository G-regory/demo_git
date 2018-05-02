package devoir_johan;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		int a=5, b=25, c=30;
		List<Integer> test2=new ArrayList<>();
		
        //doit faire foreach pour retour list
		test2=retournA(a,b,c);
		for(Integer nb: test2) {
		
		System.out.println(nb);
		}
	}
	public static List retournA(int a ,int b ,int c) {
		int[] tab =new int[2];
		int test=0;
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(a);
		list1.add(b);
		list1.add(c);
		

		for(Integer nb:list1) {
			if(nb>15) {
				//System.out.println(nb);
				list2.add(nb);
				return list2;
			}
			
		}
		return list2;
		
	}
}

