package LinkedList;


public class Runner {
	public static void main(String[] args) {
		LinkedList  list = new LinkedList();
		list.insert(2);
		list.insert(3);
		list.insert(4);
//		list.show();
//		System.out.println("---------------------------------------------------------");
		list.insertAtStart(22);
//		list.show();
		
		System.out.println("----------------------------------------------------------");
		
		list.insertAt(0, 55);
		list.show();
		System.out.println("--------------------------------delete --------------------");
		list.deleteAt(21);
		list.show();
		
		System.out.println("----------------delete all -------------------------------");
		list.deleteAll();
		list.show();
	}
}