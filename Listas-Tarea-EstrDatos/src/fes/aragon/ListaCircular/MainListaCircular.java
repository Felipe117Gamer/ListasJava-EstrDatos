package fes.aragon.ListaCircular;

import java.util.Scanner;

public class MainListaCircular {
	
	public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver la lista");
            System.out.println("2. Agregar dato al principio");
            System.out.println("3. Agregar dato al final");
            System.out.println("4. Eliminar dato al principio");
            System.out.println("5. Eliminar dato al final");
            System.out.println("6. Rotar la lista");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
            
                case 1:
                    if (listaCircular.isEmpty()) {
                        System.out.println("La lista circular esta vacia.");
                    } 
                    else {
                        System.out.println("Esta es la lista circular:");
                        listaCircular.imprimirLista();
                    }
                    break;
                    

                case 2:
                    System.out.println("Dame el dato a agregar al principio:");
                    String valorAgregarInicio = scanner.next();
                    listaCircular.agregarAlInicio(valorAgregarInicio);
                    break;
                    

                case 3:
                    System.out.println("Dame el dato a agregar al final:");
                    String valorAgregarFinal = scanner.next();
                    listaCircular.agregarAlFinal(valorAgregarFinal);
                    break;
                    

                case 4:
                    if (listaCircular.isEmpty()) {
                        System.out.println("La lista circular esta vacia.");
                    } 
                    else {
                        listaCircular.eliminarAlInicio();
                        System.out.println("Se elimino el dato inicial");
                    }
                    break;
                    

                case 5:
                    if (listaCircular.isEmpty()) {
                        System.out.println("La lista circular esta vacia.");
                    } 
                    else {
                        listaCircular.eliminarAlFinal();
                        System.out.println("Se elimino el dato final");
                    }
                    break;
                    
                    
                case 6:
                	//listaCircular.actualizarLista();
                	System.out.println("Dame las veces a rotar la lista:");
                    int vecesRotar = scanner.nextInt();
                    listaCircular.rotarNVeces(vecesRotar);
                    System.out.println("La lista circular ha sido rotada " + vecesRotar + " veces.");
                    break;
                    
                    

                case 7:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Eso no es posible (lee bien)");
            }
        }
    }

}
