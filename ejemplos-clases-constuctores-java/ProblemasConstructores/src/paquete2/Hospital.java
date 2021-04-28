/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    /*
        Crear un constructor que reciba como parámetros
        valores que serán asignados a los atributos.
    
     */
    public Hospital(String nombre1, String ciudad1, int numDoctores, int numEnfermeros) {
        nombre = nombre1;
        ciudad = ciudad1;
        numeroDoctores = numDoctores;
        numeroEnfermeros = numEnfermeros;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Ciudad: %s\n"
                + "Numero De Doctores: %d\n"
                + "Numero De Enfermeros: %d\n",
                obtenerNombre(), obtenerCiudad(), obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadenaFinal;
    }
}
