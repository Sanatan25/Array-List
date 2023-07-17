import java.util.ArrayList;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i)+" ");
		}

	}

}
