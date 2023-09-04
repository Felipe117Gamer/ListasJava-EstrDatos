package fes.aragon.ListaDoble;

import java.util.Scanner;

public class MainListaDoble {
	
    public static void main(String[] args) {
    	
        ListaDoble ListaDoble = new ListaDoble();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver la lista");
            System.out.println("2. Revertir la lista");
            System.out.println("3. Agregar dato");
            System.out.println("4. Eliminar dato");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
            
            	case 1:
            		if (ListaDoble.estaVacia()) {
            			System.out.println("La lista esta vacia.");
            		} 
            		else {
            			System.out.println("Esta es la lista:");
            			ListaDoble.imprimirLista();
            		}
            		break;
                
                    
                case 2:
                	if (ListaDoble.estaVacia()) {
                        System.out.println("La lista esta vacia.");
                    } 
                    else {
                    	System.out.println("Esta es la lista inversa:");
                        ListaDoble.revertir();
                    }
                    
                    break;
                    
                    
                case 3:
                    System.out.println("Donde quieres agregar el dato:");
                    System.out.println("1. Al principio");
                    System.out.println("2. Al final");
                    int agregarOpcion = scanner.nextInt();

                    System.out.println("Ingrese el dato a agregar:");
                    String valorAgregar = scanner.next();

                    if (agregarOpcion == 1) {
                    	ListaDoble.agregarAlInicio(valorAgregar);
                    } else if (agregarOpcion == 2) {
                    	ListaDoble.agregarAlFinal(valorAgregar);
                    } else {
                        System.out.println("Eso no es posible (lee bien)");
                    }
                    break;
                    
                    
                case 4:
                	
                	if (ListaDoble.estaVacia()) {
                        System.out.println("La lista esta vacia.");
                    } 
                    else {
                    	 System.out.println("Donde quieres eliminar el dato:");
                         System.out.println("1. Al principio");
                         System.out.println("2. Al final");
                         int eliminarOpcion = scanner.nextInt();
                         
                         if (eliminarOpcion == 1) {
                         	ListaDoble.eliminarAlInicio();
                         	System.out.println("Se elimino el dato inicial");
                         } 
                         else if (eliminarOpcion == 2) {
                         	ListaDoble.eliminarAlFinal();
                         	System.out.println("Se elimino el dato final");
                         } 
                         else {
                             System.out.println("Eso no es posible (lee bien)");
                         }
                    }
                	break;
                    
                case 5:
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Eso no es posible (lee bien)");
            }
        }
    }
}