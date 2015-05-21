import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {
        generate(30);
    }

    public static void generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= n; i ++) {
            if (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        System.out.println(primeFactors);
    }



}
