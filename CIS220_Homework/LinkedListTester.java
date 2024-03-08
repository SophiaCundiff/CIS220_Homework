// Sophia Cundiff
// Chpt4 PA

// This program tests the LinkedList.java and Node.java programs

public class LinkedListTester {
	public static void main(String[] args) {
		// Create and append nodes 1-3 to the list
		LinkedList testList = new LinkedList();
		Node node1 = new Node(1);
		testList.listAppend(node1);
		Node node2 = new Node(2);
		testList.listAppend(node2);
		Node node3 = new Node(3);
		testList.listPrepend(node3);
		
		//Insert nodes 4-7
		Node node4 = new Node(4);
		testList.listInsertAfter(testList.getHead(), node4);
		Node node5 = new Node(5);
		testList.listInsertAfter(testList.getTail(), node5);
		Node node6 = new Node(6);
		testList.listInsertAfter(node4, node6);
		Node node7 = new Node(7);
		testList.listInsertAfter(node2, node7);
		
		// Print the list
		testList.listTraverse();
		
		// Remove the head node
		testList.listRemoveNodeAfter(null);
		
		// Remove the node after node7
		testList.listRemoveNodeAfter(node7);
		
		// Print the list
		testList.listTraverse();
		
		// Search for node5 and print if it was found or was not found
		if (testList.listSearch(5) != null) {
			System.out.println("Node with data 5 was found.");
		}
		else {
			System.out.println("Node with data 5 was not found.");
		}
		
		// Search for node2 and print if it was found or not found
		if (testList.listSearch(2) != null) {
			System.out.println("Node with data 2 was found.");
		}
		else {
			System.out.println("Node with data 2 was not found.");
		}
		
		// Get and print the sum of the node values
		System.out.println("The sum of the Linked List values is " + testList.sumDataValues());
		
		
	}
}