package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    public static void main(String[] args){
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();
        int N = 500;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                B.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                int size_B = B.size();
                assertEquals(L.size(), B.size());
                System.out.println("size: " + size);
            } else if (operationNumber == 2) {
                if (L.size() >=1) {
                    L.removeLast();
                    System.out.println("L removeLast");
                }
                if (B.size() >=1){
                    B.removeLast();
                    System.out.println("B removeLast");
                }
                if (L.size()>=1 && B.size()>=1){
                    assertEquals(L.removeLast(), B.removeLast());
                }
            }else {
                if (L.size() >=1) {
                    int last = L.getLast();
                    System.out.println("getLast( L "+ last+ ")");
                }
                if (B.size() >= 1){
                    int last_B = B.getLast();
                    System.out.println("getLast( B "+ last_B+ ")");
                }
                if (L.size() >=1 && B.size() >= 1) {
                    assertEquals(L.getLast(), B.getLast());
                }
            }
        }
    }
}
