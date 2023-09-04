package fes.aragon.ListaDoble;

public class ListaDoble {
	
	NodoDoble cabeza;

    public ListaDoble() {
        cabeza = null;
    }
    
    

    public void agregarAlInicio(String dato) {
    	NodoDoble nuevoNodoDoble = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevoNodoDoble;
        } else {
            nuevoNodoDoble.siguiente = cabeza;
            cabeza.anterior = nuevoNodoDoble;
            cabeza = nuevoNodoDoble;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void agregarAlFinal(String dato) {
    	NodoDoble nuevoNodoDoble = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevoNodoDoble;
        } else {
        	NodoDoble actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodoDoble;
            nuevoNodoDoble.anterior = actual;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void imprimirLista() {
    	NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void revertir() {
    	NodoDoble actual = cabeza;
    	NodoDoble temp = null;

        while (actual != null) {
            temp = actual.anterior;
            actual.anterior = actual.siguiente;
            actual.siguiente = temp;
            actual = actual.anterior;
        }

        if (temp != null) {
            cabeza = temp.anterior;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void eliminarAlInicio() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            }
        } else {
            System.out.println("La lista está vacía. No se puede eliminar al inicio.");
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void eliminarAlFinal() {
    	
        if (cabeza != null) {
            NodoDoble actual = cabeza;
            
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            if (actual.anterior != null) {
                actual.anterior.siguiente = null;
            } 
            
            else {
                cabeza = null;
            }
            
        } 
        
        else {
            System.out.println("La lista está vacía. No se puede eliminar al final.");
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    
    public boolean estaVacia() {
        return cabeza == null;
    }
 
}