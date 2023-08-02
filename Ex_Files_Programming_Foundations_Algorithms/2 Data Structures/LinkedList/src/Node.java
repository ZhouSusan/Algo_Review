public class Node {
    private int data;
    private int next;
    public Node(int data) {
        this.data = data;
        this.next = Integer.parseInt(null);
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int next() {
        return this.next;
    }
}
