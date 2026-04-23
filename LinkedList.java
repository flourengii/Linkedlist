package ADT;

public class LinkedList{
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    //append atau instert last
    public void append(int nv){
        Node a = new Node(nv);
        if(this.head == null){
            this.head = a;
        }else{
            Node p = this.head;
            while(p.getNext() != null){
                p = p.getNext();
            }
            p.setNext(a);
        }
    }

    //print
    public void print(){
        Node ptr = this.head;
        while(ptr != null){
            System.out.print(ptr.getValue() + " -> ");
            ptr = ptr.getNext();
        }
    }

    //mencari nilai
    public boolean Cari(int x){
        Node cari = this.head;
        boolean ketemu = false;
        while(cari != null && !(ketemu)){
            if(cari.getValue() == x) ketemu = true;
            cari = cari.getNext();
        }
        return ketemu;
    }

    //mencari kemunculan
    public int Kemunculan(int x){
        Node muncul = this.head;
        int count = 0;
        while(muncul != null){
            if(muncul.getValue() == x) count++;
            muncul = muncul.getNext();
        }
        return count;
    }

    //insert first
    public void insertFirst(int x){
        Node sambung = new Node(x);
        sambung.setNext(this.head);
        this.head = sambung;
    }

    //insert after
    public void insertAfter(int x, Node prev){
        Node nn = new Node(x);
        nn.setNext(prev.getNext());
        prev.setNext(nn);
    }

    //delete first
    public Node delFirst(){
        Node ptr = this.head;
        this.head = ptr.getNext();
        ptr.setNext(null);
        return ptr;
    }

    //delete after
    public Node delAfter(Node prev){
        Node ptr = prev.getNext();
        prev.setNext(ptr.getNext());
        ptr.setNext(null);
        return ptr;
    }

    //delete last
    public Node delLast(){
        Node last;
        if(this.head.getNext() == null){
            last = this.head;
            this.head = null;
        }else{
            Node ptr = this.head;
            while(ptr.getNext().getNext() != null){
                ptr = ptr.getNext();
            }
            last = ptr.getNext();
            ptr.setNext(null);
        }
        return last;
    }
}