package randomizedtest;

public class testAddThreeRemoveThree {
    public static void main(String[] args){
        BuggyAList<Integer> btest = new BuggyAList<>();
        btest.addLast(4);
        btest.addLast(5);
        btest.addLast(6);
        btest.removeLast();
        btest.removeLast();
        btest.removeLast();
    }

}
