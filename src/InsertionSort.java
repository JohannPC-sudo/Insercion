/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Arrays;
/**
 *
 * @author Johann López
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
        public void sort(int[] array) {
        int n = array.length; // Obtiene la longitud del array
        for (int i = 1; i < n; ++i) { // Bucle externo para cada elemento a insertar
            int key = array[i]; // Guardar el valor del elemento a insertar
            int j = i - 1; // Inicializar j para comparar con los elementos anteriores
            // Mover los elementos del array[0..i-1], que son mayores que key, a una posición adelante de su posición actual
            while (j >= 0 && array[j] > key) { // Mientras haya elementos mayores que key
                array[j + 1] = array[j]; // Mover el elemento a la derecha
                j = j - 1; // Decrementar j
            }
            array[j + 1] = key; // Insertar key en su posición correcta
        }
        
      }

       public static void main(String[] args) {
        // TODO code application logic here
        InsertionSort sorter = new InsertionSort(); // Crear una instancia de InsertionSort
        int[] array = {5, 3, 8, 4, 2}; // Definir el array a ordenar
        sorter.sort(array); // Llamar al método sort para ordenar el array
        System.out.println(Arrays.toString(array)); // Imprimir el array ordenado

    }
    
}

