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
		newNode.next= head; //���ο� ����� ������ ���� �ص尡 �����ϰ��ִ� ���
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
	
	
}
