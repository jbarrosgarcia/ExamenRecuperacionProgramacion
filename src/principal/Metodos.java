/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jbarrosgarcia
 */
public class Metodos {

    ArrayList<Entradas> lista = new ArrayList<Entradas>();
    Entradas entrada = new Entradas();

    public void llenarArray() {
        for (int i = 0; i < 5; i++) {
            entrada.llenarEntrada();
            lista.add(i,entrada);
        }
    }

    public void visualizar(Entradas ent) {
        System.out.println(ent.toString());
    }

    public void consultar(String grad) {
        boolean encontrado=false;
        int cont=0;
        for (int o = 0; o < 5; o++) {
            entrada=lista.get(o);
            if (grad.equalsIgnoreCase(entrada.getGrada())) {
                encontrado=true;
                cont++;
                if(encontrado!=false&&cont<=1){
                    System.out.println(entrada.getPrezo() + " €");
                }
            } else {
                System.out.println("Esa grada no existe");
            }
        }
    }

    public void escribirFichero() {
        File fichero = new File("entradas.txt");
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(fichero));
            for (int p = 0; p < 5; p++) {
                bw.write(lista.iterator().toString());
            }
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
