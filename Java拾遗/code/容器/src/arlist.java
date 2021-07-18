import java.util.ArrayList;

public class arlist {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.remove(new Integer(1));
        System.out.println(al);
        System.out.println(al.get(0));

    }
}
