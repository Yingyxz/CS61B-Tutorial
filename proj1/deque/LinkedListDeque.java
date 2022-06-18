package deque;

//import java.util.Iterator;

public class LinkedListDeque<T> implements Deque<T> {

//    public static void main(String[] args){
//        LinkedListDeque<Integer> l = new LinkedListDeque<>(3);
//        l.addFirst(4);
//        l.addLast(2);
//        boolean b = l.isEmpty();
//        l.printDeque();
//        l.removeFirst();
//        l.removeLast();
//        System.out.println(l.get(1));
//
//        System.out.println(2);
//    }
    private class StuffNode{
        public StuffNode next;
        public StuffNode prev;
        public T num;

        public StuffNode(T i, StuffNode f, StuffNode n){
            next = n;
            prev = f;
            num = i;
        }

        public T get(){
            return num;
        }
    }
    private StuffNode sentinel;
    private int size;

    public LinkedListDeque(){
        sentinel = new StuffNode(null,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }
    @Override
    public void addFirst(T item){
        sentinel.next = new StuffNode(item, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }
    @Override
    public void addLast(T item){
        size +=1;
        sentinel.prev.next = new StuffNode(item, sentinel.prev, sentinel);
        sentinel.prev = sentinel.prev.next;
    }

//    public boolean isEmpty(){
//        if (size == 0) {
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
        StuffNode p = sentinel;
        while(p.next != sentinel){
            System.out.print(p.next.get()+" ");
            p = p.next;
        }
        System.out.println();
    }

    @Override
    public T removeFirst(){
        if(size == 0){
            return null;
        }else{
            T a = sentinel.next.get();
            sentinel.next.prev = null;
            sentinel.next = sentinel.next.next;
            sentinel.next.prev.next = null;
            sentinel.next.prev = sentinel;
            size -= 1;
            return a;
        }

    }

    @Override
    public T removeLast(){
        if(size == 0){
            return null;
        }else {
            T a = sentinel.prev.get();
            sentinel.prev.next = null;
            sentinel.prev = sentinel.prev.prev;
            sentinel.prev.next.prev = null;
            sentinel.prev.next = sentinel;
            size -= 1;
            return a;
        }
    }

    @Override
    public T get(int index){
        if(index < size) {
            StuffNode p = sentinel;
            int ind = 0;
            while (ind != index) {
                p = p.next;
                ind += 1;
            }
            return p.next.get();
        }else{
            return null;
        }
    }

//    public T getRecursive(int index){
//        if(index <= size){
//            if(index == 0){
//                return sentinel.next.get();
//            }else{
//                sentinel.next = sentinel.next.next;
//                return getRecursive(index-1);
//            }
//
//        }else{
//            return null;
//        }
//    }

//    /** Special Method */
//    public Iterator<T> iterator(){}
//    public boolean equals(Object o){} instance of
//    有两个不会做；getRecursion不懂怎么做成recursion（因为它是LLD的函数，不是StuffNode的函数）
}