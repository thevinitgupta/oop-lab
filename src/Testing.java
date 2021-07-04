
public class Testing {
    public static void main(String[] args) {
        MyLinkedList LL = new MyLinkedList();
        LL.add(30);
        LL.add(34);
        LL.add(4);
        LL.add(42);
        LL.add(10);
        LL.print();
        LL.insert(50, 4);
        LL.print();
        LL.delete(34);
        LL.print();
    }
}
