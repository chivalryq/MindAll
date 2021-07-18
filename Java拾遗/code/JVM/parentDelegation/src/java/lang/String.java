package java.lang;

public class String {
    public String toString(){
        return "Hello";
    }
//    错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
//    public static void main(String[] args)
    public static void main(String[] args) {
        String s=new String();
        System.out.println(s.toString());
    }
}
