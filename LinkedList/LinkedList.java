package LinkedList;
public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head == null) {
            head = node;
        }else{
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node n = head;
        if(n == null) {
        	return;
        }
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
    
    public void insertAtStart(int data) {
    	Node node = new Node();
    	node.data = data;
    	node.next = head;
    	head = node;
    	
    }
    
    public void insertAt(int index,int value) {
    	Node node = new Node();
    	node.data = value;
    	node.next = null;
    	Node n = head;
    	if(index == 0) {
    		insertAtStart(value);
    		return;
    	}
    	for(int i=0;i<index-1;i++) {
    		n = n.next;
    	}
    	node.next = n.next;
    	n.next = node;
    }
    
    public void deleteAt(int index) {
    	if(index == 0) {
    		head = head.next;
    	}else {
    		Node n = head;
    		for(int i=0;i<index-1;i++) {
    			if(n.next == null) {
    				return;
    			}
        		n = n.next;
        	}
    		Node next = n.next;
    		n.next = next.next;
    		
    	}
    }
    
    public void deleteAll() {
    	if(head != null) {
    		head  = null;
    	}
    }