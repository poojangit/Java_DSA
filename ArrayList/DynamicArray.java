package ArrayList;

public class DynamicArray {
    private int[] data;
    private int capacity;
    private int size;

    public DynamicArray(){
        capacity = 10;
        data = new int[capacity];
        size = 0;
    }
    public void add(int value){
        if(size == capacity){
            resize();
        }
        data[size++] = value;
    }

    public void resize(){
        capacity = capacity*2;
        int[] newData = new int[capacity];
        for(int i=0; i<size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
    public int getValue(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }
    public int size() {
        return size;
    }
    public void remove(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for(int i=index; i< size-1; i++){
            data[i] = data[i+1];
        }
        size --;
    }
    public void display(){
        for(int i=0; i<size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
