public class z12 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 30; i++) {
            sum += (double) i / (31 - i);
        }
        System.out.println(sum);


    }
}

