import java.util.List;

public class Workshop {
    public static void main(String[] args) {
    }

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
        for (int i = 0; i < limite; i++) {
            resultado[i] = numero * (i + 1);
        }
        return resultado;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no debe ser negativo");
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("El número no puede ser negativo");
        if (n == 0) return new int[0];
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) resultado[i] = 0;
            else if (i == 1) resultado[i] = 1;
            else resultado[i] = resultado[i - 1] + resultado[i - 2];
        }
        return resultado;
    }

    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int n : arreglo) {
            suma += n;
        }
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        double suma = 0;
        int cantidad = 0;
        for (int n : arreglo) {
            suma += n;
            cantidad++;
        }
        if (cantidad == 0) return 0.0;
        return suma / (double) cantidad;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int n : arreglo) {
            if (n > mayor) {
                mayor = n;
            }
        }
        return mayor;
    }
}