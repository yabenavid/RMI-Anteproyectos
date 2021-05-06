/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.utilidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author YENNYFER, YEFERSON
 */
public class UtilidadesArchivosTxt {

    public static ArrayList<String> leerArchivo() {
        String varLinea;
        ArrayList<String> varLineas = new ArrayList<>();
        try {
            FileReader varLector = new FileReader("ArchivoEntrada.txt");
            BufferedReader varAlmacenamiento = new BufferedReader(varLector);

            while ((varLinea = varAlmacenamiento.readLine()) != null) {
                varLineas.add(varLinea);
            }

            varAlmacenamiento.close();
            varLector.close();
        } catch (FileNotFoundException e) {

            System.out.println("\nThe file is empty or doesn't exist. Check your content.");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        if (varLineas.isEmpty()) {
            System.out.println("\nThe file is empty or doesn't exist. Check your content.");
            System.exit(0);
        }
        return varLineas;
    }

    public static String leerLinea() {
        String varLinea = "";
        try {
            FileReader varLector = new FileReader("file.txt");
            BufferedReader varAlmacenamiento = new BufferedReader(varLector);

            varLinea = varAlmacenamiento.readLine();

            varAlmacenamiento.close();
            varLector.close();
        } catch (FileNotFoundException e) {
            System.out.println("\nEl archivo esta vacio o no existe. Revise su contenido.");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return varLinea;
    }

    public void escribirArchivo(String nombreArchivo, String prmTexto) {
        File varArchivo = new File(nombreArchivo + ".txt");
        FileWriter varEscritor;
        BufferedWriter varBufferEscritor;
        if (varArchivo.exists() == false) {
            try {
                varArchivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            varEscritor = new FileWriter(varArchivo);
            varBufferEscritor = new BufferedWriter(varEscritor);
            varBufferEscritor.write(prmTexto);
            varBufferEscritor.flush();
            varBufferEscritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
