package sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
	static boolean findNumber(List<Integer> arr, int k) {
		int i = 0;

		int size = arr.size();
		Iterator<Integer> itr = arr.iterator();
		while (itr.hasNext()) {
			if (itr.equals(k)) {
				i = 0;
				break;
			}
		}
		if (i == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> k = new ArrayList<Integer>();
		k.add(1);
		k.add(2);
		k.add(3);
		k.add(4);
		k.add(5);
		System.out.println(k);
		System.out.println(Practice.findNumber(k, 1));

	}

}
