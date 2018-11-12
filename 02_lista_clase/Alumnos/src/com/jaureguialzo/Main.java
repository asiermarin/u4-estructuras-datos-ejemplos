package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Número de alumnos en clase: ");
        int numAlumnos = Integer.parseInt(br.readLine());

        String[] nombres = new String[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Nombre: ");
            nombres[i] = br.readLine();
        }

        String respuesta;
        do {
            System.out.print("Búsqueda: ");
            respuesta = br.readLine().toUpperCase();

            if (!respuesta.equals("FIN")) {

                // Extraer la primera letra
                char letra = respuesta.charAt(0);

                // Búsqueda en un array

                for (int i = 0; i < nombres.length; i++) {
                    if (letra == nombres[i].toUpperCase().charAt(0)) {
                        System.out.println(nombres[i]);
                    }
                }

            }

        } while (!respuesta.equals("FIN"));

    }
}
