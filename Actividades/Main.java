package Actividades;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        gestor.agregarTarea(new Tarea("Revisar códigos", 1));
        gestor.agregarTarea(new Tarea("Enviar informe de ejercicios", 3));
        gestor.agregarTarea(new Tarea("Publicar Notas", 2));

        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        System.out.println("\nEliminando tarea 'Enviar informe de ejercicios '...");
        gestor.eliminarTarea(new Tarea("Enviar informe", 3));

        System.out.println("\n¿Contiene 'Revisar correos'? " +
                gestor.contieneTarea(new Tarea("Revisar códigos", 1)));

        System.out.println("Total de tareas: " + gestor.contarTareas());

        System.out.println("Tarea más importante: " + gestor.obtenerTareaMasPrioritaria());

        gestor.invertirTareas();
        System.out.println("\nLista de tareas invertida:");
        gestor.imprimirTareas();

        System.out.println("\nMarcando como completada 'Revisar códigos'...");
        gestor.transferirATareasCompletadas(new Tarea("Revisar códigos", 1));

        System.out.println("\nTareas actuales:");
        gestor.imprimirTareas();
        gestor.imprimirTareasCompletadas();
    }
}
