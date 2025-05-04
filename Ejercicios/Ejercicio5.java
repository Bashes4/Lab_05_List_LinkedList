package Ejercicios;

public class Ejercicio5 {
    public static <T> boolean sonIguales(Node<T> l1, Node<T> l2) {
        Node<T> a = l1;
        Node<T> b = l2;

        while (a != null && b != null) {
            if (!a.data.equals(b.data)) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }
}
