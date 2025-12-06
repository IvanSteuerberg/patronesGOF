package singleton;

public class Singleton {

    private static Singleton instance;

    // El constructor es privado para evitar la creación de instancias desde fuera de la clase.
    private Singleton() {
        System.out.println("Creando una instancia de Singleton.");
    }

    /**
     * Proporciona un punto de acceso global a la única instancia de la clase.
     * La primera vez que se llama, crea la instancia. Las llamadas posteriores
     * devuelven la misma instancia.
     * @return La única instancia de la clase Singleton.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos de ejemplo de la instancia.
    public void showMessage() {
        System.out.println("¡Hola desde la instancia Singleton!");
    }

    public void doSomething() {
        // Lógica de negocio aquí.
        System.out.println("La instancia Singleton está haciendo algo.");
    }
}
