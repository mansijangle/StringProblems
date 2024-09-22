useing binary search in doubly linklist



import java.util.*;

class Node{
	int data;
	Node next;
	Node back;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.back = null;
	}
	Node(int data,Node next1,Node next2 ){
		this.data = data;
		this.next = next1;
		this.back = next2;
		
	}
	
}	

public class DoublyLinkList {
static Node head = null;
static Node tail = null;

public void insertAtEnd(int data) {
	Node newnode = new Node(data);
	if(tail==null) {
	   head = newnode;
        tail = newnode;		
	}else {
		tail.next = newnode;
		newnode.back = tail;
		tail = newnode;
	}
}
public static void BinarySearchOnDLL(Node head,int x) {
	if(head==null) {
		System.out.println("data is not found");
	}
	Node low = head;
    Node high = countNode(head);
    
    while(low.data < high.data) {
    	
    	if(low.data==x) {
    		System.out.println("data is found at lowest "+x);
    		break;
    	}
    	else if(high.data==x) {
    		System.out.println("data is found at highest : "+x);
    		break;
    	}else if(low.data <= x) {
    		low = low.next;
    	}
    	else {
    	high = high.back;
    	}
    }
    
  }

public static Node countNode(Node head) {
	int len = 0;
	while(head.next!=null) {
		head = head.next;
		len++;
	}
    return head;
	
}
public static void main(String args[]) {	
	DoublyLinkList dl = new DoublyLinkList();
//	dl.insertAtEnd(9);
//	dl.insertAtEnd(100);
//	dl.insertAtEnd(70);
//	dl.insertAtEnd(8);
//	dl.insertAtEnd(10);
//	dl.insertAtEnd(22);
//	
//	dl.traveseFront();


//	  DoublyLinkList.serachElement(arrNode,11);
	System.out.println("Deleting element using binary search");

	  DoublyLinkList.BinarySearchOnDLL(arrNode,789);
	

	}
}
