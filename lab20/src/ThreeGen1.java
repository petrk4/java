public class ThreeGen1<T extends String, V extends Animal, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen1(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void showTypes() {
        System.out.println("ob1: " + ob1.getClass().getName());
        System.out.println("ob2: " + ob2.getClass().getName());
        System.out.println("ob3: " + ob3.getClass().getName());

    }

    public static void main(String[] args) {
        ThreeGen1<String, Cat, Integer> threeGen1 = new ThreeGen1<>("str", new Cat(), 4);
        threeGen1.showTypes();
    }
}
