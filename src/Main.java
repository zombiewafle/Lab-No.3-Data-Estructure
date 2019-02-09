import java.util.Scanner;

import sorts.Estructura;
import sorts.Sorts;

/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructura de Datos
 * @author Marco Flores 16260
 * @author Javier Salazar 18764
 * Descripcion del programa: Este programa tiene como meta ordenar distintos arrays, de distintos datos, en esta ocasion
 * se usaran enteros. Se tienen distintos metodos de ordenamiento, entre ellos: Gnome, Merge, Quick, Radix y
 *
 */


public class Main {


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int select = Integer.parseInt(sn.nextLine());

        //Mientras que la opcion elegida no sea 6, el menu continuara corriendo
        //Try catch para evitar que el programa termine si hay un error


        try{
            Sorts sorts = new Sorts()
            System.out.println("Elige la opcion:\n" +
                    "\t1. Gnome Sort\n" +
                    "\t2. Merge Sort\n" +
                    "\t3. Quick Sort\n" +
                    "\t4. Radix Sort\n" +
                    "\t5. Bubble Sort\n" +
                    "\t6. Salir");
            //Recogre una variable por consola opcion igual a un entero.parseInt

            switch(select){
                case 1:
                    System.out.println("Ha elegido el Gnome Sort!!");
                    sorts.GnomeSort();
                    break;
                case 2:
                    System.out.println("Ha elegido el Merge Sort!!");
                    sorts.MergeSort();
                    break;
                case 3:
                    System.out.println("Ha elegido el Quick Sort!!");
                    sorts.QuickSort();
                    break;
                case 4:
                    System.out.println("Ha elegido el Radix Sort!!");
                    sorts.RadixSort();
                    break;
                case 5:
                    System.out.println("Ha elegido el Bubble Sort!!");
                    sorts.BubbleSort();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Numero no reconocido!!!");
            }
            System.out.println("\n");
        }catch (Exception e){
            System.out.println("Opcion Invalida");
        }

    }
}
