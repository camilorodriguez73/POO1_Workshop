import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

  // Método que suma dos números enteros
public int sumarDosNumeros(int a, int b) {
        return a + b;
}

    public int mayorDeTresNumeros(int a, int b, int c) {
    if (a >= b && a >= c) return a;
    if (b >= c) return b;
    return c;
}

      public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];
        for(int i = 0; i < limite; i++){
            resultado[i] = numero * (i + 1);
        }   
        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0){
                throw new IllegalArgumentException("El número no debe ser negativo");
        }
        int resultado = 1;

        for (int i = 2; i <= n; i++ ){
            resultado *= i;
        }
        return resultado;
    }

    
       // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero; i++) {
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

	// Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {

        if (n < 0){
            throw new IllegalArgumentException("El número de elementos no puede ser negativo");
        }

        if (n == 0){
            return new int[0];
        }

        int[] resultado = new int [n];

        for (int i = 0; i < n; i++){
            if (i == 0){
                resultado[i] = 0;
            } else if (i == 1){
                resultado[i] = 1;
            } else {
                resultado[i] = resultado[i - 1] + resultado[i - 2];
            }
        }
        
        return resultado;
    }


