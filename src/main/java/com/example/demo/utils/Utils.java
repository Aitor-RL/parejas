package com.example.demo.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Utils {
    public static String ContarLetras(String value) {
        int vCount = 0;
        int cCount = 0;
        value = value.toLowerCase();
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }

        return "Hay " + vCount + " vocales y hay " + cCount + " consonantes";
    }



    public static String darLaVuelta(String value) {
       
        // Esta será la cadena invertida, primero está vacía
        String invertida = "";
		// Recorremos la original del final al inicio
		for (int i = value.length() - 1; i >= 0; i--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invertida += value.charAt(i);
		}
        return invertida;
    }



    public static void save(String fileName, String text) throws IOException {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(fileName, true); // modo append
            pw = new PrintWriter(fw);
            pw.print(text);
        } finally {
            if (pw != null)
                pw.close();
        }
    }

    public static boolean remove(String fileName) {
        File f = new File(fileName);
        boolean result = f.delete();
        return result;
    }

}
