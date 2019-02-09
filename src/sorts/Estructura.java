package sorts;

import java.util.Random;
import java.io.*;

public class Estructura implements Comparable<Object>{

    /**
     * atributo lista es un arreglo de enteris para almencenar los 3000 numeros aleatorios
     */
    protected int[] lista;

    /**
     * Constructor de la clase, aqui mismo se crea la lista con los 3000 numeros enteros aleatorios y se guarda en un archivo.txt
     * @throws IOException
     */
    public Estructura()throws IOException{
        Random  rnd = new Random();
        lista = new int[3000];
        for(int i = 0; i<lista.length; i++){
            lista[i] = (int) (rnd.nextDouble() * 100000.0 + 0.0);
        }
        String ruta = "D:\\documentos\\NetBeansProjects\\hoja-sorts\\random.txt";
        File archivo = new File(ruta);
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for(int i = 0; i<lista.length; i++){
            bw.write(lista[i]+ "\n");
        }
        bw.close();
    }

    public void setLista(int[] lista){
        this.lista = lista;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
