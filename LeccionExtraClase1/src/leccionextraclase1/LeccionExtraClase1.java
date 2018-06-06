/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionextraclase1;

/**
 *
 * @author leona
 */
public class LeccionExtraClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String reporte = "";
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];
        int suma;
        double promedio;
        reporte = String.format("Arreglo 1\tArreglo 2\tResultado\n");

        for (int contador = 0; contador < arreglo1.length; contador++) {
            arreglo3[contador] = arreglo1[contador] / arreglo2[contador];

            reporte = String.format("%s%d\t\t%d\t\t%.1f\n", reporte, arreglo1[contador], arreglo2[contador], arreglo3[contador]);

        }
        reporte = String.format("El promedio de arreglo3 es:\n %s",reporte);
                
        System.out.println(reporte);
    }

}
