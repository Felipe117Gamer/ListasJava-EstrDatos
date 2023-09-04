package fes.aragon.ListaSimple;

public class ListaSimple {
	
	Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }
    
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void agregarAlInicio(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
    }
    
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void agregarAlFinal(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
    
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void eliminarAlInicio() {
        if (!isEmpty()) {
            cabeza = cabeza.siguiente;
        }
    }

    public void eliminarAlFinal() {
        if (!isEmpty()) {
            if (cabeza.siguiente == null) {
                cabeza = null;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = null;
            }
        }
    }
    
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

}
