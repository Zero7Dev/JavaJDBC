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

public class Vehiculo {

    private String placa;
    private int año;
    private double precio;
    private int numeroDeMarchas;
    private boolean EsNuevo;

    public Vehiculo() {

    }

    public Vehiculo(String placa, int año, double precio, int numeroDeMarchas, boolean EsNuevo) {
        this.placa = placa;
        this.año = año;
        this.precio = precio;
        this.numeroDeMarchas = numeroDeMarchas;
        this.EsNuevo = EsNuevo;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la placa del vehículo: ");
        placa = scanner.nextLine();
        System.out.print("Ingrese el año del vehículo: ");
        año = scanner.nextInt();
        System.out.print("Ingrese el precio del vehículo: ");
        precio = scanner.nextDouble();
        System.out.print("Ingrese el numero de marchas que tiene el auto: ");
        numeroDeMarchas = scanner.nextInt();
//        System.out.print("¿El auto es nuevo 0 Kilometros? (1=Si / 2:No): ");
//        int opcion = scanner.nextInt();
//        if (opcion == 1) {
//            EsNuevo = true;
//        } else {
//            EsNuevo = false;
//        }
    }

    public double calcularPrecio() {
        if (año == 2023) {
            precio += 1000;
        }
        if (EsNuevo) {
            precio += 500;
        }
        precio += numeroDeMarchas * 100;
        return precio;
    }

    public void mostrarDatos() {
        System.out.println("Placa: " + placa);
        System.out.println("Año: " + año);
        System.out.println("Precio: $" + precio);
        System.out.println("Numero de velocides con las que el auto cuenta: " + numeroDeMarchas);
        String AutoNuevo = EsNuevo ? "Si" : "No";
        System.out.println("El auto es de paquete : " + AutoNuevo);
    }

    public static void main(String[] args) {
        System.out.println("Nombre: Julio Coloma Vera");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.ingresarDatos();
        vehiculo.calcularPrecio();
        System.out.println("\nDatos del vehículo:");
        vehiculo.mostrarDatos();
    }
}
