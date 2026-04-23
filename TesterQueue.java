package ADT;

public class TesterQueue {
    public static void main(String[] args) {
        QueueList Q = new QueueList();
        System.out.println(Q.isEmpty());
        System.out.println(Q.isOneElmt());

        Q.enQueue(1);
        System.out.println(Q.isOneElmt());

        Q.enQueue(2);
        Q.enQueue(3);
        Q.enQueue(4);

        Q.print();
        Q.deQueue();

        System.out.println();
        Q.print();
    }
}
