/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String ciudad;
        int numeroDoctores;
        int numeroEnfermeros;
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        System.out.println("Ingrese el nombre del hospital:");
        nombre = sc.nextLine();
        System.out.println("Ingrese la ciudad del hospital:");
        ciudad = sc.nextLine();
        System.out.println("Ingrese el numero de doctores del hospital:");
        numeroDoctores = sc.nextInt();
        System.out.println("Ingrese el numero de Enfermeros del hospital:");
        numeroEnfermeros = sc.nextInt();
        Hospital h1 = new Hospital(nombre, ciudad, numeroDoctores, numeroEnfermeros);
        System.out.printf("De la forma en la que se llama a un objeto:\n%s", h1);
        System.out.printf("=================================\n"
                + "De la forma de los obtener:\n"
                + "Nombre: %s\n"
                + "Ciudad: %s\n"
                + "Numero De Doctores: %d\n"
                + "Numero De Enfermeros: %d\n", h1.obtenerNombre(),
                h1.obtenerCiudad(), h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());
    }
}
