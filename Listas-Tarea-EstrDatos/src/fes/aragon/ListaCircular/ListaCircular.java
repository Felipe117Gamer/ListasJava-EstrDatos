package fes.aragon.ListaCircular;

public class ListaCircular {
	
    NodoCircular cabeza;

    public ListaCircular() {
        cabeza = null;
    }
    

    public boolean isEmpty() {
        return cabeza == null;
    }
    
    ///agrego los if por si fallan los del main
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void agregarAlFinal(String dato) {
        NodoCircular nuevoNodo = new NodoCircular(dato);
        if (isEmpty()) {
            nuevoNodo.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            NodoCircular ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            nuevoNodo.siguiente = cabeza;
            ultimo.siguiente = nuevoNodo;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void imprimirLista() {
        if (isEmpty()) {
            System.out.println("La lista circular está vacía.");
            return;
        }

        NodoCircular actual = cabeza;
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println();
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void agregarAlInicio(String dato) {
        NodoCircular nuevoNodo = new NodoCircular(dato);
        if (isEmpty()) {
            nuevoNodo.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            NodoCircular ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
            ultimo.siguiente = cabeza;
        }
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void eliminarAlInicio() {
        if (!isEmpty()) {
            if (cabeza.siguiente == cabeza) {
                cabeza = null;
            } else {
                NodoCircular ultimo = cabeza;
                while (ultimo.siguiente != cabeza) {
                    ultimo = ultimo.siguiente;
                }
                cabeza = cabeza.siguiente;
                ultimo.siguiente = cabeza;
            }
        } else {
            System.out.println("La lista circular esta vacia. No se puede eliminar.");
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void eliminarAlFinal() {
        if (!isEmpty()) {
            if (cabeza.siguiente == cabeza) {
                cabeza = null;
            } else {
                NodoCircular ultimo = cabeza;
                NodoCircular penultimo = null;
                while (ultimo.siguiente != cabeza) {
                    penultimo = ultimo;
                    ultimo = ultimo.siguiente;
                }
                penultimo.siguiente = cabeza;
            }
        } else {
            System.out.println("La lista circular esta vacia. No se puede eliminar.");
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void rotarNVeces(int veces) {
    	if (isEmpty() || cabeza == cabeza.siguiente || veces <= 0) {
            System.out.println("no se puede");
            return;
        }

        NodoCircular ultimo = cabeza;
        while (ultimo.siguiente != cabeza) {
            ultimo = ultimo.siguiente;
        }

        for (int i = 0; i < veces; i++) {
            cabeza = ultimo;
            ultimo = ultimo.siguiente;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    

}