/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1.desayunoSorpresa;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.Scanner;

public class Ventilador {

    private String marca;
    private int velocidad;
    private boolean estaEncendido;
    private float precio;
    
    public Ventilador() {
    }

    public Ventilador(String marca, int velocidad, boolean estaEncendido, float precio) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.estaEncendido = estaEncendido;
        this.precio = precio;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        System.out.print("Velocidades elija entre [1 - 4]: ");
        velocidad = scanner.nextInt();
        System.out.print("¿Está encendido el ventilador?  [ 1=Si / 2:No ]: ");
           int opcion = scanner.nextInt();
        if (opcion == 1) {
            estaEncendido = true;
        } else {
            estaEncendido = false;
        }
        
        System.out.print("Precio: ");
        precio = scanner.nextFloat();
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("El ventilador se encuentra " + (estaEncendido ? "encendido" : "apagado"));
        System.out.println("Precio: $" + precio);
    }

    public double calcularDescuento() {
        if (precio > 100) {
            return precio * 0.1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nombre: Julio Coloma Vera");
        Ventilador ventilador1 = new Ventilador();
        System.out.println("Datos del Ventilador 1:");
        ventilador1.ingresarDatos();
        ventilador1.imprimirDatos();
        double descuento1 = ventilador1.calcularDescuento();
        System.out.println("Descuento: $" + descuento1);
        Ventilador ventilador2 = new Ventilador("xtratech", 3, true, 15.4f);
        System.out.println("\nDatos del Ventilador 2:");
        ventilador2.imprimirDatos();
        double descuento2 = ventilador2.calcularDescuento();
        System.out.println("Descuento: $" + descuento2);
    }
}
