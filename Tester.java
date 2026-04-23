package ADT;

public class Tester {
    public static void main(String[] args) {
        // 1. Membuat objek LinkedList baru
        LinkedList L = new LinkedList();

        // 2. Memasukkan data ke dalam list menggunakan method append
        L.append(10);
        L.append(20);
        L.append(30);
        L.insertFirst(0);
        L.insertAfter(5, L.head);

        // 3. Menampilkan isi LinkedList
        System.out.println("Isi list saat ini:");
        L.print();

        System.out.println();
        Node del = L.delLast();
        System.out.println(del);
        L.print();

        System.out.println();
        int targetCari = 10;
        if (L.Cari(targetCari)) {
            System.out.println("Hasil Cari: Angka " + targetCari + " ditemukan dalam list.");
        } else {
            System.out.println("Hasil Cari: Angka " + targetCari + " tidak ditemukan.");
        }

        int targetHitung = 10;
        int jumlah = L.Kemunculan(targetHitung);
        System.out.println("Hasil Kemunculan: Angka " + targetHitung + " muncul sebanyak " + jumlah + " kali.");
        L.print();

        System.out.println();
        System.out.println();
        // Membuat 3 objek Node secara terpisah
        Node n1 = new Node(5);
        Node n2 = new Node(15);
        Node n3 = new Node(25);

        // Menghubungkan secara manual: n1 -> n2 -> n3
        n1.setNext(n2);
        n2.setNext(n3);

        // Memasukkan n1 sebagai head ke dalam LinkedList
        LinkedList listManual = new LinkedList();
        listManual.head = n1;

        System.out.println("Hasil Link Manual:");
        listManual.print(); // Memanggil method cetak
    }
}
