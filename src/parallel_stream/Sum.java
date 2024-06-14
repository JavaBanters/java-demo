package parallel_stream;

import java.util.stream.IntStream;

public class Sum {

    private int total ;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input) {
        total += input;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        Sum sum2 = new Sum();

        IntStream.rangeClosed(1, 1000)
                .forEach(sum::performSum);

        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum2::performSum);

        System.out.println(sum.getTotal());
        System.out.println(sum2.getTotal());
    }

}
