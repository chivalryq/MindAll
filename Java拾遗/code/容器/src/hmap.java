import java.util.HashMap;
import java.util.Map;

public class hmap {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        //put返回被替换的值
        System.out.println(m.put(1,"hello"));
        System.out.println(m.put(1,"world"));

//        m.put(2,"two");
//        m.remove(2);
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("hello"));
        for(Map.Entry<Integer,String> s:m.entrySet()){
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }
    }
}
