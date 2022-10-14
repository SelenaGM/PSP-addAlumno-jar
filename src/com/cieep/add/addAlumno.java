package com.cieep.add;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class addAlumno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String destino = sc.nextLine();
        String linea= sc.nextLine();

        File destinoFinal = new File(destino);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(destinoFinal, true));

            bw.write(linea);
            bw.newLine();

            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}