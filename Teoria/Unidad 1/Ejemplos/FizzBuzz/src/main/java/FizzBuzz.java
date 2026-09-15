public class FizzBuzz {

    public String print(int numero){

        if (multiploCinco(numero) && multiploTres(numero)) {
            return "FizzBuzz";
        }
        if (multiploCinco(numero)) {
            return "Buzz";
        }
        if (multiploTres(numero)) {
            return "Fizz";
        }
        return numero+"";
    }

    private static boolean multiploTres(int numero) {
        return numero % 3 == 0;
    }

    private static boolean multiploCinco(int numero) {
        return numero % 5 == 0;
    }

}
