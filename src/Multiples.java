/**
 * Solve the FizzBuzz challenge.
 */
class Multiples {

    public static void main(String[] args) {
        int i = 1;
        int c = 0;
        while (i < 1000) {

            if (i % 3 == 0 || i % 5 == 0){
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
}
