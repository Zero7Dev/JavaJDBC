/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desayuno_Sorpresa;

/**
 *
 * @author USER
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author USER
 */

    

import java.util.Scanner;

public class Desayuno_Sorpresa {
    private double precio;
    private String mensajeTarjeta;
    private String bebida;
    private String elementoSal;
    private String elementoDulce;
    private String[] frutas;
    private boolean flores;

    public Desayuno_Sorpresa() {
        this.precio = 0.0;
        this.mensajeTarjeta = "";
        this.bebida = "";
        this.elementoSal = "";
        this.elementoDulce = "";
        this.frutas = new String[4];
        this.flores = false;
    }

    public Desayuno_Sorpresa(double precioInicial, String mensajeTarjeta, String bebida,
            String elementoSal, String elementoDulce, String[] frutas, boolean flores) {
        this.precio = precioInicial;
        this.mensajeTarjeta = mensajeTarjeta;
        this.bebida = bebida;
        this.elementoSal = elementoSal;
        this.elementoDulce = elementoDulce;
        this.frutas = frutas;
        this.flores = flores;
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mensaje de la tarjeta para el desayuno :");
        mensajeTarjeta = sc.nextLine();
        System.out.println("Ingrese la bebida:");
        bebida = sc.nextLine();
        System.out.println("Ingrese el elemento de sal:");
        elementoSal = sc.nextLine();
        System.out.println("Ingrese el elemento de dulce:");
        elementoDulce = sc.nextLine();
        int llevaFrutas;
        int numeroDeFrutas = 0;
        System.out.println("Desea agregar frutas al desayuno?Ingrese un numero ( 1=SI / 2=NO )");
        llevaFrutas = Integer.parseInt(sc.nextLine());
        if (llevaFrutas == 1) {
            System.out.println("Cuantas frutas desea en su desayuno");
            numeroDeFrutas = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < numeroDeFrutas; i++) {
            System.out.println("Ingrese la fruta #" + (i + 1));
            String fruta = sc.nextLine();
            frutas[i] = fruta;
        }
         System.out.print("Tiene flores? (1=Si / 2:No): ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            flores = true;
        } else {
            flores = false;
        }
       
    }

      public double calcularPrecio() {
        double incremento = 0.0;

        if (flores) {
            incremento += 5.0;
        }
        if (frutas.length > 2) {
            incremento += 1.5;
        }
        if (elementoSal.equalsIgnoreCase("bolón") || elementoSal.equalsIgnoreCase("encebollado")) {
            incremento += 2.50;
        }
        if (elementoDulce.equalsIgnoreCase("mini torta") || elementoDulce.equalsIgnoreCase("cheesecake")) {
            incremento += 2.50;
        }

        return precio + incremento;
    }

    public void mostrarDatos() {
        System.out.println("Mensaje de la tarjeta: " + mensajeTarjeta);
        System.out.println("Bebida: " + bebida);
        System.out.println("Elemento de sal: " + elementoSal);
        System.out.println("Elemento de dulce: " + elementoDulce);
        System.out.println("Frutas:");
        for (String fruta : frutas) {
            if (fruta != null && !fruta.isEmpty()) {
                System.out.println("- " + fruta);
            }
        }
        String FloresDesayuno=flores?"Si":"No";
        System.out.println("Tiene flores: " + FloresDesayuno);
        System.out.println("Precio del desayuno sorpresa: $" + calcularPrecio());
    }

    public static void main(String[] args) {
        System.out.println("Nombre: Julio Coloma Vera");
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("Menú:");
            System.out.println("1. Crear un desayuno sorpresa");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                Desayuno_Sorpresa desayuno = new Desayuno_Sorpresa();
                desayuno.ingresarDatos();
                desayuno.mostrarDatos();
            }
        }
    }
}

}
