/**
 * Created by hannahwaxman on 20/05/15.
 */

import java.util.ArrayList;

public class PrimeNumbers {

        public static void generate(int n) {
            ArrayList<Integer> primeFactors = new ArrayList<Integer>();

            for (int i = 2; i <= n; i ++) {
                while (n % i == 0) {
                    primeFactors.add(i);
                    n /= i;
                }
            }
            System.out.println(primeFactors);
        }

        public static void main(String[] args) {
            generate(30);
        }

}
