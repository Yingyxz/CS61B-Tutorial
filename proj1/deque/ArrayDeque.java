package deque;

public class ArrayDeque<T> implements Deque<T> {
//    public static void main(String[] args){
//        ArrayDeque<Integer> ad = new ArrayDeque<>();
//        ad.addFirst(8);
//        ad.addFirst(9);
//        ad.addLast(7);
//        ad.addLast(6);
//        ad.addLast(5);
//        ad.addLast(4);
//        ad.addLast(3);
//
//        boolean test = ad.isEmpty();
//        ad.printDeque();
//        ad.removeFirst();
//        ad.removeLast();
////        int test2 = ad.get(1);
//
//        System.out.println(2);
//    }
    /** 这是原来自己做的普通Alist */
    private T[] items;
    private Integer size;

    public ArrayDeque(){
        items = (T[]) new Object[8];
        size = 0;
    }
    private void resize(int capacity){
        T[] a = (T[])new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;

    }
    @Override
    public void addFirst(T item){
        if (size == items.length){
            resize(size*2);
        }
        T[] b = (T[]) new Object[size+1];
        b[0] = item;
        System.arraycopy(items,0,b,1,size);
        items = b;
        size +=1;

    }

    @Override
    public void addLast(T item){
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = item;
        size += 1;
    }

//    public boolean isEmpty(){
//        if (size == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void printDeque(){
        for (int i = 0; i < size; i += 1){
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }

    @Override
    public T removeFirst(){
        T[] temp = (T[]) new Object[size-1];
        System.arraycopy(items,1,temp,0,size-1);
        T a = items[0];
        items[0] = null;
        items = temp;
        size -= 1;
        return a;
    }

    @Override
    public T removeLast(){
        T a = items[size-1];
        items[size-1] = null;
        size -= 1;
        return a;
    }

    @Override
    public T get(int index){
        if (index <= size){
            return items[index -1];
        }else{
            return null;
        }
    }

//    public Iterator<T> iterator()
//    public boolean equals(Object o) instance of
//    addFirst和removeFirst有疑问（如何constant time）；

////这是标准答案circle Alist.
//    private T[] items;
//    private int size;
//    private int nextFirst;
//    private int nextLast;
//
//    public ArrayDeque(){
//        items = (T[]) new Object[8];
//        size = 0;
//        nextFirst = 2;
//        nextLast = size+nextFirst+1;
//    }
//
//    private void resize(int capacity) {
//        T[] a = (T[]) new Object[capacity];
//        System.arraycopy(items, nextFirst+1, a, nextFirst+size, size);
//        nextFirst = nextFirst+size-1;
//        nextLast = nextFirst+size+1;
//        items = a;
//    }
//
//
//    public void addFirst(T item){
//        if(nextFirst == 0){
//            resize(size*3);
//        }
//        items[nextFirst] = item;
//        nextFirst -= 1;
//        size += 1;
//
//    }
//    public void addLast(T item){
//        if(nextLast == items.length-1){
//            resize(size*3);
//        }
//        items[nextLast] = item;
//        nextLast += 1;
//        size += 1;
//
//    }
//
//    public boolean isEmpty(){
//        if(size == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public int size(){
//        return size;
//    }
//
//    public void printDeque(){
//        for(int i = nextFirst+1;i <= size + nextFirst;i++){
//            System.out.print(items[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public T removeFirst(){
//        if(size != 0){
//            T a = items[nextFirst+1];
//            items[nextFirst+1] = null;
//            nextFirst += 1;
//            size -= 1;
//            return a;
//        }else{
//            return null;
//        }
//    }
//
//    public T removeLast(){
//        if(size != 0){
//            T a = items[nextLast - 1];
//            items[nextLast - 1] = null;
//            nextFirst -= 1;
//            size -= 1;
//            return a;
//        }else{
//            return null;
//        }
//    }
//
//    public T get(int index){
//            return items[index];
//    }
//    public Iterator<T> iterator()
//    public boolean equals(Object o)

}
