package ADT;

public class QueueList {
    //atribut
    public Node head;
    public Node tail;
    private int size;

    //constructor default
    public QueueList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //validasi bahwa stack kosong
    public boolean isEmpty(){
        return this.head == null;
    }

    //validasi bahwa isi hanya 1 element
    public boolean isOneElmt(){
        return this.head != null && this.head == this.tail;
    }

    //berfungsi menambahkan nilai pada akhir list, sama seperti append
    public void enQueue(int nv){
        Node p = new Node(nv);
        if(isEmpty()){
            this.head = p;
            this.tail = p;
        }else{
            this.tail.setNext(p);
            this.tail = p;
        }
        this.size++;
    }

    //berfungsi menghapus nilai pada awal atau di head, sama seperti delete first
    public Node deQueue(){
        Node delNode = this.head;
        if(isOneElmt()){
            this.head = null;
            this.tail = null;
        }else{
            this.head = delNode.getNext();
            delNode.setNext(null);
        }
        this.size--;
        return delNode;
    }

    //print
    public void print(){
        Node ptr = this.head;
        if(isEmpty()){
            System.out.println("Queue kosong");
        }else{
            while(ptr != null){
                System.out.print(ptr.getValue());
                ptr = ptr.getNext();
            }
        }
    }
}
