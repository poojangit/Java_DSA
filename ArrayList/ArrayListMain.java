package ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.getValue(0));
        arr.display();
        arr.remove(0);
        arr.display();
       System.out.println( arr.size());

    }
}
