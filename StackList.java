package ADT;

public class StackList {
    //atribut
    public Node head;
    private int size;

    //constructor default
    public StackList(){
        this.head = null;
        this.size = 0;
    }
    
    //validasi bahwa stack kosong
    public boolean isEmpty(){
        return this.head == null;
    }

    //menambahkan nilai di head atau sama seperti insert first
    public void push(int nv){
        Node ptr = new Node(nv);
        ptr.setNext(this.head);
        this.head = ptr;
        this.size++;
    }

    //menghapus stack pada head atau top sama seperti delete first
    public Node pop(){
        Node delNode;
        delNode = this.head;
        this.head = delNode.getNext();
        delNode.setNext(null);
        this.size--;
        return delNode;
    }

    //berfungsi untuk mengintip data paling atas atau head
    public int peek(){
        int data;
        if(isEmpty()){
            data = -999;
        }else{
            data = this.head.getValue();
        }
        return data;
    }

    //print semua stack
    public void print(){
        Node ptr;
        if(isEmpty()){
            System.out.println("Stack kosong");
        }else{
            ptr = this.head;
            while(ptr != null){
                System.out.print(ptr.getValue());
                ptr = ptr.getNext();
            }
        }
    }
}
