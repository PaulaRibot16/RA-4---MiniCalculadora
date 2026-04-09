/**
 * La clase MiniCalculadoraEjemplo proporciona métodos estáticos para realizar
 * operaciones matemáticas básicas como el cálculo del valor absoluto y la raíz cuadrada.

 * @author Paula Ribot
 * @version 1.0
 */

public class MiniCalculadoraEjemplo {
    /**
     * Calcula el valor absoluto de un número double.
     * @param numero el número a evaluar
     * @return el valor positivo del número
     */
    public static double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    /**
     * Calcula la raíz cuadrada de un número double.
     * @param numero el número a evaluar
     * @return la raíz cuadrada del número
     */
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }
}
