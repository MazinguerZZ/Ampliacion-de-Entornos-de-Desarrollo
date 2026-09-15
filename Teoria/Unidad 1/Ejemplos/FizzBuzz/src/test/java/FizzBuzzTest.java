import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
Escriba un programa que imprime una línea por cada número del 1 al 100
Por lo general, solo imprima el número en sí.
Para múltiplos de tres impresiones FizzEn lugar del número
Para los múltiplos de cinco impresiones BuzzEn lugar del número
Para números que son múltiplos de tres y cinco impresiones FizzBuzzEn lugar del número
 */

public class FizzBuzzTest {
    FizzBuzz fb;    // Se inicializa

    @BeforeEach     // Como si fuera un constructor y siempre antes de los test y sirve para inicializar
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void numerosQueSeQuedanIgual() {
        Assertions.assertEquals("1", fb.print(1));  //No haria falta tantas comprobaciones (para todos los test)
        Assertions.assertEquals("2", fb.print(2));
        Assertions.assertEquals("4", fb.print(4));
        Assertions.assertEquals("38", fb.print(38));
    }

    @Test
    public void hacenFizz() {
        Assertions.assertEquals("Fizz", fb.print(3));
        Assertions.assertEquals("Fizz", fb.print(6));
        Assertions.assertEquals("Fizz", fb.print(9));
    }

    @Test
    public void hacenBuzz() {
        Assertions.assertEquals("Buzz", fb.print(5));
        Assertions.assertEquals("Buzz", fb.print(10));
    }

    @Test
    public void hacenFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", fb.print(15));
        Assertions.assertEquals("FizzBuzz", fb.print(30));
    }
}
