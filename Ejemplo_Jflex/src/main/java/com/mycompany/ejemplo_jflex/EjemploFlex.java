/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_jflex;

import java.io.FileReader;
import java.io.Reader;
import mi.primer.scanner.Scanner;

/**
 *
 * @author Oscar
 */
public class EjemploFlex {

    public static void main(String[] args) {
        try {
            Reader r = new FileReader("prueba.txt");

            Scanner analizadorLexico = new Scanner(r);
            analizadorLexico.yylex();

        } catch (Exception e) {
        }
    }
}
