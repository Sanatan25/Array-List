import java.util.ArrayList;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		int idx1 = 1;
		int idx2 = 3;
		System.out.println(list);
		int temp = list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, temp);
		System.out.println(list);

	}

}
