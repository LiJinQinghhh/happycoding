package JAVA�����ͷ�����ҵ;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * ʹ��LinkedList�ֱ�ʵ�ֶ��С���ջ(�Զ�����С���ջ�࣬��װLinkedList��)��
 */
public class Collection4 {
	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		
		//����
		MyQue MyQue = new MyQue();
		System.out.print("��ӣ�   ");
		MyQue.inQueue("С��");
		MyQue.inQueue("С��");
		MyQue.inQueue("С��");
		System.out.println(MyQue.toString());
		System.out.print("���ӣ�   ");
		if(!MyQue.isEmpty()) {
			MyQue.outQueue();
		}
		System.out.println(MyQue.toString());
		
		System.out.println();
		
		//ջ
		Stack sta= new Stack();
		System.out.print("��ջ��");
		sta.inStack("С��");
		sta.inStack("С��");
		sta.inStack("С��");
		System.out.println( sta.toString() );
		System.out.print("��ջ��");
		if(!sta.isEmpty()) {
			sta.outStack();
		}
		System.out.println(sta.toString());
		
	}
}


//���е�ʵ��
class MyQue{
	
	private LinkedList<Object> linklist;
	
	public MyQue(){
		linklist = new LinkedList<Object>();
	}
	
	//��Ӳ���
	public void inQueue(Object obj){
		linklist.addLast(obj);
	}
	
	//���Ӳ���
	public void outQueue(){
		linklist.removeFirst();
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return linklist.isEmpty();
	}
	
	@Override
	public String toString() {
		Iterator<Object> iterator = linklist.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "    ");
		}
		return null;
	}
}


//ջ��ʵ��
class Stack{
	
	private LinkedList<Object> linklist;
	
	public Stack(){
		linklist = new LinkedList<Object>();
	}
	
	//��ջ����
	public void inStack(Object obj){
		linklist.addFirst(obj);
	}
	
	//��ջ����
	public void outStack(){
		linklist.removeFirst();
	}
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return linklist.isEmpty();
	}
	
	@Override
	public String toString() {
		Iterator<Object> iterator = linklist.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "    ");
		}
		return null;
	}
}
