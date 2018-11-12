package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] recuento = new int[26];

    //"ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Frase: ");
        String frase = br.readLine();

        contarLetras(frase);
        visualizarRecuento();
    }

    public static void contarLetras(String frase) {

        for (int i = 0; i < frase.length(); i++) {

            int posicion = frase.toLowerCase().charAt(i) - 97;

            if (posicion >= 0 && posicion <= 25) {
                recuento[posicion]++;
            }
        }
    }

    public static void visualizarRecuento() {

        for (int i = 0; i < recuento.length; i++) {
            char letra = (char) (i + 65);
            System.out.println("Numero de " + letra + ": " + recuento[i]);
        }

    }

}
