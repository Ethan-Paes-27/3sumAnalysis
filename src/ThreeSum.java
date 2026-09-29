import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import edu.princeton.cs.algs4.In;


public class ThreeSum {

    // Count triples that sum to 0 (brute force O(n^3))
    public static int count(int[] a) {

        int count = 0;
        //TODO: Finish THreeSum

        return count;
    }

    public static void main(String[] args) throws IOException {
        In in = new In(args[0]);
        int[] a = in.readAllInts();


        // Time only the count() call
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();

        System.out.printf("Count = %d  time = %.3f seconds%n", count, time);
    }
}