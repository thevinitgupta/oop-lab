public class MyDLL {
	DLLNode head;
	DLLNode tail;
    static class DLLNode{
    	int data;
    	DLLNode next;
    	DLLNode prev;
    	public DLLNode(int data) {
    		this.data=data;
    		next=null;
    		prev=null;
    	} 
    }
    	public void add (int data) {
    		DLLNode toAdd= new DLLNode(data);
    		if(isEmpty()) {
    			head=toAdd;
                System.out.println("DLL is empty!");
    			//toAdd.prev=null;
    			tail=toAdd;
    			return;
    		}
    		DLLNode temp=tail;
    		temp.next=toAdd;
    		toAdd.prev=temp;
            tail= toAdd;
    	}
    	
    	boolean isEmpty(){
    		{
    			return head==null;
    		}
    	 }
    	
    	public void print() {
    		DLLNode temp=head;
    		while(temp!=tail) {
    			System.out.print(temp.data+" --> ");
    			temp=temp.next;
    		}
    		System.out.println(temp.data);
    	}
    	
    	public void insert(int number, int search) {
    		
    	}
    }
