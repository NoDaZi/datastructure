package list.linked.implementation;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size=0;
	
	private class Node {
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data=input;
			this.next =null;
			
		}
		public String toString() {
			return String.valueOf(this.data);
		}
		
		
	}
	public void addFirst(Object input) {
		Node newNode= new Node(input);// 객체화
		newNode.next= head; //새로운 노드의 다음은 현재 해드가 지정하고있는 노드
		head = newNode; // 해드를 새로운 노드로 바꿈
		size++;
		if(head.next==null) {
			tail = head;
		}
	}
	public void addLast(Object input) {
		Node newNode= new Node(input);
		if(size==0) {//데이터가 하나도없을경우
			addFirst(input); // addFirst에서 사이즈를 늘리기 때문에 따로 넣을필요없음
		}
		else//데이터가 이미존재할때
		{
			tail.next=newNode;
			tail=newNode;
			size++;
		}
		
	}
	
	
}
