package fes.aragon.ListaSimple;

import java.util.Scanner;

public class MainListaSimple {
	
	public static void main(String[] args) {
        ListaSimple listaSimple = new ListaSimple();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver la lista");
            System.out.println("2. Agregar dato al principio");
            System.out.println("3. Agregar dato al final");
            System.out.println("4. Eliminar dato al principio");
            System.out.println("5. Eliminar dato al final");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (listaSimple.isEmpty()) {
                        System.out.println("La lista simple esta vacia.");
                    } else {
                        System.out.println("Esta es la lista simple:");
                        listaSimple.imprimirLista();
                    }
                    break;
                    

                case 2:
                    System.out.println("Dame el dato a agregar al principio:");
                    String valorAgregarInicio = scanner.next();
                    listaSimple.agregarAlInicio(valorAgregarInicio);
                    break;
                    

                case 3:
                    System.out.println("Dame el dato a agregar al final:");
                    String valorAgregarFinal = scanner.next();
                    listaSimple.agregarAlFinal(valorAgregarFinal);
                    break;
                    

                case 4:
                    if (listaSimple.isEmpty()) {
                        System.out.println("La lista simple esta vacia.");
                    } else {
                        listaSimple.eliminarAlInicio();
                        System.out.println("Se eliminó el dato inicial");
                    }
                    break;
                    

                case 5:
                    if (listaSimple.isEmpty()) {
                        System.out.println("La lista simple esta vacia.");
                    } else {
                        listaSimple.eliminarAlFinal();
                        System.out.println("Se elimino el dato final");
                    }
                    break;
                    

                case 6:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Eso no es posible (lee bien)");
            }
        }
    }

}
