package Generics;

import java.util.Arrays;
//public class CustomArrayList<? extends Number> This is called java wildClass
//public class CustomArrayList<T extends Number> Here we can only use classes that are subClass of Number
public class CustomArrayList<T> {
    private Object[] data;
    private int size = 0;

    public CustomArrayList(){
        int DEFAULT_SIZE = 10;
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
       data[size++] = num;
    }

    public void remove(){
        size--;
    }

    public int size(){
        return size;
    }

    public Object get(int index){
        return (Object)(data[index]);
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = (data[i]);
            data = temp;
        }
    }

    public String toString(){
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(9));
        list.add(Integer.valueOf(10));

        CustomArrayList<String> list2 = new CustomArrayList<>();
        list2.add("Anshu");
        list2.add("Manash");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list2);
    }
}
