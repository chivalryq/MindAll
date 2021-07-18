import java.util.LinkedList;

public class lklist {
    public static void fun1(){

        LinkedList<Integer> a=new LinkedList<>();
        a.push(1);
        a.push(2);
//        a.push(3);
        //有一些栈的方法
        System.out.println(a);
        System.out.println(a.poll());
//        System.out.println(a.pollFirst());
//        System.out.println(a.pollLast());
        System.out.println(a.pop());
        //和pop的区别是如果为空会返回null
        Integer b=a.poll();
        System.out.println(b);
    }
    public static void fun2(){
        //队列
        LinkedList<Integer> b=new LinkedList<>();
        b.push(1);
        b.push(2);
        b.push(3);
        System.out.println(b);
        //getFirst
        System.out.println(b.getFirst());
        System.out.println(b);
        System.out.println(b.peek());
        System.out.println(b.element());
    }
    public static void main(String[] args) {
        fun2();
    }
}
