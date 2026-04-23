package ADT;

public class TesterStack {
    public static void main(String[] args) {
        StackList S = new StackList();
        boolean empt = S.isEmpty();
        System.out.println(empt);

        S.push(1);
        S.push(2);
        S.push(3);

        S.print();

        empt = S.isEmpty();
        System.out.println();
        System.out.println(empt);

        S.pop();
        S.print();
        System.out.println();
        System.out.println(S.peek());
    }
}
