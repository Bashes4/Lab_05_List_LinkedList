package Ejercicios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	// Ejercicio 1
        List<Integer> listaNumeros = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("¿Contiene 30? " + Ejercicio1.buscarElemento(listaNumeros, 30));
        System.out.println("¿Contiene 99? " + Ejercicio1.buscarElemento(listaNumeros, 99));
        //Ejercicio 2
        List<Integer> invertida = Ejercicio2.invertirLista(listaNumeros);
        System.out.println("\nLista invertida: " + invertida);
        //Ejercicio 3
        Node<Integer> head = new Node<>(1);
        head = Ejercicio3.insertarAlFinal(head, 2);
        head = Ejercicio3.insertarAlFinal(head, 3);
        //Ejercicio 4
        head = Ejercicio3.insertarAlFinal(head, 4);
        System.out.print("\nLista enlazada tras insertar 4: ");
        imprimirLista(head);
        //Ejercicio 5
        int totalNodos = Ejercicio4.contarNodos(head);
        System.out.println("\nTotal de nodos: " + totalNodos);

        Node<Integer> lista1 = new Node<>(100);
        lista1 = Ejercicio3.insertarAlFinal(lista1, 200);
        lista1 = Ejercicio3.insertarAlFinal(lista1, 300);

        Node<Integer> lista2 = new Node<>(100);
        lista2 = Ejercicio3.insertarAlFinal(lista2, 200);
        lista2 = Ejercicio3.insertarAlFinal(lista2, 300);

        System.out.println("¿Lista1 y Lista2 son iguales? " + Ejercicio5.sonIguales(lista1, lista2));

        lista2 = Ejercicio3.insertarAlFinal(lista2, 400);
        System.out.println("¿Lista1 y Lista2 siguen iguales? " + Ejercicio5.sonIguales(lista1, lista2));
        //Ejercicio 6
        Node<Integer> listaConcatenada = Ejercicio6.concatenarListas(head, lista1);
        System.out.print("\nLista concatenada: ");
        imprimirLista(listaConcatenada);
    }

    public static <T> void imprimirLista(Node<T> head) {
        Node<T> actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}




