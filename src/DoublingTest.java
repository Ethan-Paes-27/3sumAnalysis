public class DoublingTest {
    public static double timeTrial(int n) {
        int MAX = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = (int)(Math.random() * 2 * MAX) - MAX;
        Stopwatch timer = new Stopwatch();
        int count = ThreeSumFast.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        System.out.printf("%7s %7s %5s%n", "N", "Time(s)", "Ratio");
        double prev = timeTrial(125);
        for (int n = 250; n <= 32000; n *= 2) {
            double time = timeTrial(n);
            System.out.printf("%7d %7.3f %5.1f%n", n, time, time / prev);
            prev = time;
        }
    }
}