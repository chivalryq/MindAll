import java.util.LinkedList;
import java.util.Queue;

public class q {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        Integer a=q.peek();
        System.out.println(q);
        System.out.println(a);
        System.out.println(q.element());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
