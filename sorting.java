import java.util.ArrayList;
import java.util.Collections;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(10);
		list.add(9);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		//Collections.sort(list,Collections.reverseOrder());
		//System.out.println(list);

	}

}
