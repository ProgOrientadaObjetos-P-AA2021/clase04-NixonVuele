/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

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
        Crear un constructor que no tenga parámetros
        y que asigne valores ya establecidos a todos 
        los atributos.
    nombre: Isidro Ayora
    ciudad: Loja
    numeroDoctores: 100
    numeroEnfermeros: 200
    
     */
    public Hospital() {
        nombre = "Isidro Ayora";
        ciudad = "Loja";
        numeroDoctores = 100;
        numeroEnfermeros = 200;
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
                + "Numero De Doctores: %d"
                + "\nNumero De Enfermeros:%d\n",
                obtenerNombre(), obtenerCiudad(), obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadenaFinal;
    }
}
