public class pgm19_1 {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{1998,2010}};
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int pop[] = new int[2051], res = 0;
        for (var l : logs) {
            ++pop[l[0]];
            --pop[l[1]];
        }
        for (int i = 1950; i < 2050; ++i) {
            pop[i] += pop[i - 1];
            res = pop[i] > pop[res] ? i : res;
        }
        return res;
    }
}
