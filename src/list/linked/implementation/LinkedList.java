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
		Node newNode= new Node(input);// ��üȭ
		newNode.next= head; //���ο� ����� ������ ���� �ص尡 �����ϰ��ִ� ���1
		head = newNode; // �ص带 ���ο� ���� �ٲ�
		size++;
		if(head.next==null) {
			tail = head;
		}
	}
	public void addLast(Object input) {
		Node newNode= new Node(input);
		if(size==0) {//�����Ͱ� �ϳ����������
			addFirst(input); // addFirst���� ����� �ø��� ������ ���� �����ʿ����
		}
		else//�����Ͱ� �̹������Ҷ�
		{
			tail.next=newNode;
			tail=newNode;
			size++;
		}
		
	}
	public Node node(int index) {
		Node x = head;
		for(int i=0;i<index;i++) {
			x=x.next;
		}
		
		return x;
	}
	public void add(int k,Object input) {

		if(k==0) {
			addFirst(input);
		}else {
			Node temp1= node(k-1);
			Node temp2= temp1.next;
			Node newNode= new Node(input);
			newNode.next=temp2;
			temp1.next=newNode;
			size++;
			if(newNode.next==null);{
				tail= newNode;
			}
		}
		
	}
	public String toString() {
		if(head==null) {
			return "[]";
		}else {
			Node temp =head;
			String str = "[";
			
			while(temp.next!=null) {
				str += temp.data +", ";
				temp= temp.next;
			}
			
			str+=temp.data;
			return str+"]";
		}
			
	}
	public Object removeFirst() {
		Node temp = head;
		head= head.next;
		Object returnData = temp.data;
		temp=null;
		size--;
		return returnData;
	}
	public Object remove(int k) {
		if(k==0) {
			return removeFirst();
		}
		else {
			Node temp = node(k-1);
			Node todoDeleted = temp.next;
			temp.next=temp.next.next;
			Object returnData = todoDeleted;
			if(todoDeleted==tail)
			{
				tail=temp;
			}
			todoDeleted= null;
			size--;
			return returnData;
		}
	}
	public Object removeLast() {
		return remove(size-1);
	}
	public int size() {
		return size;
	}
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	public Object indexOf(Object data) { //data �� ��ġ�ϴ� ���ؽ����� ������
		Node temp= head;
		int index = 0;
		while(temp.next!=data) {
			temp=temp.next;
			if(temp==null)
			{return -1;
			}
		}
		return index;	
	}
	public ListIterator listIterator() {
		
		return new ListIterator();
	}
	public class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		ListIterator(){
			next= head;
		}
		
		public Object next() {
			lastReturned= next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		public boolean hasNext() {
			return nextIndex < size();
		}
		
	}
}
