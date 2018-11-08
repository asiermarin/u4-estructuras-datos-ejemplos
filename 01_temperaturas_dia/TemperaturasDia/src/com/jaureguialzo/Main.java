package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double suma = 0.0;

        double[] temperaturas = new double[24];

        // Leer valores
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura: ");
            temperaturas[i] = Double.parseDouble(br.readLine());
        }

        // Calcular máxima, mínima y la suma
        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }

            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }

            suma = suma + temperaturas[i];
        }

        // Visualizar los datos
        for (int i = 0; i < temperaturas.length; i++) {

            System.out.format("%3d  ", i);

            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }

            System.out.format("  %.2f", temperaturas[i]);

            if (temperaturas[i] == min) {
                System.out.print(" --> MIN");
            }

            if (temperaturas[i] == max) {
                System.out.print(" --> MAX");
            }

            System.out.println();
        }

        // Visualizar la media
        System.out.format("Media: %.3f", suma / temperaturas.length);

    }
}
