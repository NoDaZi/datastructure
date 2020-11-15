package list.linked.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.add(1, 25);
		numbers.remove(2);
		LinkedList.ListIterator i = numbers.listIterator();
		System.out.println(i.next());
		System.out.println(i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
