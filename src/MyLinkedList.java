public class MyLinkedList {
    Node head;
    void add(int data){
        Node toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next; 
        }
        temp.next = toAdd;
    }
    static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            next = null;
        }
    }
    Boolean isEmpty(){
        return head == null;
    }

    public void insert(int value,int search){
        Node temp = head;
        Node v = head;
        Node n = new Node(value);
        while(temp!=null && temp.data!= search){
            temp = temp.next;
        }
        v = temp.next;
        temp.next = n;
        n.next = v;
    }

    public void delete(int value){
        Node prev = head,next=head;
        while(next!=null && next.data!= value){
            prev = next;
            next = next.next;
        }
        prev.next = next.next;
        
    }
    public void print(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
