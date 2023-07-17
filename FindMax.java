import java.util.ArrayList;
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < list.size(); i ++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(max);

	}

}
