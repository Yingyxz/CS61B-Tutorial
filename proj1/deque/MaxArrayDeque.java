package deque;
import java.util.Comparator;

public class MaxArrayDeque<T> {
//    private T[] items;
//    private Integer size;
//
//    public MaxArrayDeque(){
//        items = (T[]) new Object[8];
//        size = 0;
//    }
//    private void resize(int capacity){
//        T[] a = (T[])new Object[capacity];
//        System.arraycopy(items,0,a,0,size);
//        items = a;
//
//    }
//    public void addFirst(T item){
//        if (size == items.length){
//            resize(size*2);
//        }
//        T[] b = (T[]) new Object[size+1];
//        b[0] = item;
//        System.arraycopy(items,0,b,1,size);
//        items = b;
//        size +=1;
//
//    }
//
//    public void addLast(T item){
//        if (size == items.length) {
//            resize(size * 2);
//        }
//        items[size] = item;
//        size += 1;
//    }
//    public boolean isEmpty(){
//        if (size == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public int size(){
//        return size;
//    }
//    public void printDeque(){
//        for (int i = 0; i < size; i += 1){
//            System.out.print(items[i]+" ");
//        }
//        System.out.println();
//    }
//    public T removeFirst(){
//        T[] temp = (T[]) new Object[size-1];
//        System.arraycopy(items,1,temp,0,size-1);
//        T a = items[0];
//        items[0] = null;
//        items = temp;
//        size -= 1;
//        return a;
//    }
//    public T removeLast(){
//        T a = items[size-1];
//        items[size-1] = null;
//        size -= 1;
//        return a;
//    }
//    public T get(int index){
//        if (index <= size){
//            return items[index -1];
//        }else{
//            return null;
//        }
//    }
//
//    public MaxArrayDeque(Comparator<T> c){}
//    public T max(){}
}
