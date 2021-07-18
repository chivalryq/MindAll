public class Car {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        //所有car实例的getClass都一样
        Class<? extends Car> aClass = car1.getClass();
        ClassLoader classLoader = aClass.getClassLoader();//AppClassLoader

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());//ExtClassLoader
        System.out.println(classLoader.getParent().getParent());//null java程序获取不到
    }
}
