package timingtest;
import com.sun.xml.internal.rngom.nc.NsNameClass;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> Ns_temp = new AList<>();
        AList<Double> times_temp = new AList<Double>();
//        AList<Integer> opCounts_temp = new AList<>();
        AList<Integer> test = new AList<>();
        Ns_temp.addLast(1000);
        Ns_temp.addLast(2000);
        Ns_temp.addLast(4000);
        Ns_temp.addLast(8000);
        Ns_temp.addLast(16000);
        Ns_temp.addLast(32000);
        Ns_temp.addLast(64000);
        Ns_temp.addLast(128000);

        for (int p = 0;p< Ns_temp.size();p+=1){
            Stopwatch sw_temp = new Stopwatch();

            for (int a = 0; a< Ns_temp.get(p);a+=1){
                test.addLast(1);
            }
            double timeInSeconds = sw_temp.elapsedTime();
            times_temp.addLast(timeInSeconds);
        }
        printTimingTable(Ns_temp, times_temp, Ns_temp);
    }
}
