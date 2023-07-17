import java.util.ArrayList;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		//to add element on list
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		System.out.println(list);
		//to print element of the given index
		//int e = list.get(3);
		//System.out.println(e);
		
		//to remove the given element
		
		//list.remove(2);
		//System.out.println(list);
		
		//to set an element on a given index by removing the previous element
		
		//list.set(2, 10);
		//System.out.println(list);
		
		//to cheak the if an element is there or not
		
		//System.out.println(list.contains(5));
		//System.out.println(list.contains(1));
		
		
		
		//top add element on a specific index
		
		list.add(2,75);
		System.out.println(list);
		

	}

}
