/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author alu2018451
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in;
        in = new BufferedReader(new FileReader("fileeditor.txt"));
        String read = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        String[] spl = null;
        while ((read = in.readLine()) != null) {
            String[] splited = read.split("\\s+");

            linea = br.readLine();
            spl = linea.split(" ");
            switch (spl[0].toUpperCase()) {
                case "E":
                    System.out.println("EEEEEEEE");
                    break;
            }

        }

    }

}


