import java.util.Random;

public class PruebaDiagnostico {

    public static void main(String[] args) {
        calcularProm4Notas();
    }
    public static void calcularProm4Notas(){
        double[] notas = new double[4];
        for(int contador = 0; contador < notas.length; contador++){
            notas[contador] = calcularNotaAzar();
        }
        double promedio = calcularPromedio(notas);
        System.out.println("El promedio es "+promedio);
    }
    public static double calcularNotaAzar(){
        return (Math.random()*6)+1;
    }

    public static double sumarNotas(double[] notas){
        double sumaNotas = 0.0;
        for(int contador = 0; contador < notas.length; contador++){
            sumaNotas += notas[contador];
        }
        return sumaNotas;
    }
    public static double calcularPromedio(double[] notas){
        double sumaNotas = sumarNotas(notas);
        double promedio = sumaNotas/notas.length;
        return promedio;
    }
    private static double[][] generarMatriz(){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rnd = new Random();
        //desordena el arreglo
        for (int i = numeros.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = numeros[index];
            numeros[index] = numeros[i];
            numeros[i] = temp;
        }

        int[][] matriz = new int[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numeros[k];
                k++;
            }
        }
        return null;
    }
}
