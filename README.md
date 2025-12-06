# Ejemplos de Patrones de Diseño GoF

Este proyecto contiene ejemplos prácticos de varios patrones de diseño "Gang of Four" (GoF), implementados en Java. Cada patrón se encuentra en su propio paquete para mantener el código organizado y fácil de entender.

## Patrones Implementados

A continuación se muestra una lista de los patrones de diseño incluidos en este proyecto.

### Patrones Creacionales

1.  **Singleton**
    *   **Propósito**: Asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a ella.
    *   **Ubicación**: `src/singleton`
    *   **Ejecutar**: `singleton.MainSingleton`

2.  **Abstract Factory (Factoría Abstracta)**
    *   **Propósito**: Proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.
    *   **Ubicación**: `src/abstractfactory`
    *   **Ejemplo**: Creación de familias de muebles (Sillas, Mesas) para diferentes estilos (Clásico, Moderno).
    *   **Ejecutar**: `abstractfactory.MainAbstractFactory`

3.  **Builder (Constructor)**
    *   **Propósito**: Separa la construcción de un objeto complejo de su representación, de modo que el mismo proceso de construcción pueda crear diferentes representaciones.
    *   **Ubicación**: `src/builder`
    *   **Ejemplo**: Construcción de diferentes tipos de `Pizza` (Hawaiana, Picante) usando un `Cocinero` (Director).
    *   **Ejecutar**: `builder.MainBuilder`

### Patrones Estructurales

4.  **Adapter (Adaptador)**
    *   **Propósito**: Permite que interfaces incompatibles trabajen juntas. Convierte la interfaz de una clase en otra que los clientes esperan.
    *   **Ubicación**: `src/adapter`
    *   **Ejemplo**: Un `AudioPlayer` que solo entiende `mp3` puede, a través de un `MediaAdapter`, reproducir formatos `vlc` y `mp4`.
    *   **Ejecutar**: `adapter.MainAdapter`

5.  **Composite (Compuesto)**
    *   **Propósito**: Compone objetos en estructuras de árbol para representar jerarquías de parte-todo. Permite a los clientes tratar a los objetos individuales y a las composiciones de objetos de manera uniforme.
    *   **Ubicación**: `src/composite`
    *   **Ejemplo**: Un sistema de `Graphic` donde tanto las formas simples (`Dot`, `Circle`) como las compuestas (`CompoundGraphic`) se pueden tratar de la misma manera.
    *   **Ejecutar**: `composite.MainComposite`

6.  **Decorator (Decorador)**
    *   **Propósito**: Añade responsabilidades adicionales a un objeto de forma dinámica. Los decoradores proporcionan una alternativa flexible a la herencia para extender la funcionalidad.
    *   **Ubicación**: `src/decorator`
    *   **Ejemplo**: A una `Bebida` base como un `Cafe` se le añaden dinámicamente "extras" como `ConLeche` y `ConAzucar`.
    *   **Ejecutar**: `decorator.MainDecorator`

7.  **Facade (Fachada)**
    *   **Propósito**: Proporciona una interfaz unificada y simplificada a un conjunto de interfaces en un subsistema.
    *   **Ubicación**: `src/facade`
    *   **Ejemplo**: Un `BotonStart` de un coche que simplifica el proceso de encendido, coordinando el `Motor`, `SistemaElectrico` y `Sensores`.
    *   **Ejecutar**: `facade.MainFacade`

8.  **Proxy**
    *   **Propósito**: Proporciona un sustituto o marcador de posición para otro objeto para controlar el acceso a él.
    *   **Ubicación**: `src/proxy`
    *   **Ejemplo**: Un `ProxyInternet` que controla el acceso a `RealInternet`, bloqueando la conexión a sitios web prohibidos.
    *   **Ejecutar**: `proxy.MainProxy`

### Patrones de Comportamiento

9.  **Iterator (Iterador)**
    *   **Propósito**: Proporciona una forma de acceder a los elementos de un objeto agregado secuencialmente sin exponer su representación subyacente.
    *   **Ubicación**: `src/iterator`
    *   **Ejemplo**: Un iterador para una colección de `Channel` que puede filtrar por tipo.
    *   **Ejecutar**: `iterator.MainIterator`

10. **Strategy (Estrategia)**
    *   **Propósito**: Define una familia de algoritmos, encapsula cada uno y los hace intercambiables.
    *   **Ubicación**: `src/strategy`
    *   **Ejemplo**: Un `ShoppingCart` que puede procesar el pago utilizando diferentes estrategias (`CreditCardStrategy`, `PaypalStrategy`).
    *   **Ejecutar**: `strategy.MainStrategy`

11. **Observer (Observador)**
    *   **Propósito**: Define una dependencia de uno a muchos entre objetos, de modo que cuando un objeto cambia de estado, todos sus dependientes son notificados y actualizados automáticamente.
    *   **Ubicación**: `src/observer`
    *   **Ejemplo**: Un `MyTopic` (Sujeto) que notifica a varios `MyTopicSubscriber` (Observadores) cuando se publica un nuevo mensaje.
    *   **Ejecutar**: `observer.MainObserver`

## Cómo Empezar

1.  Clona o descarga este repositorio.
2.  Abre el proyecto en tu IDE de Java preferido (por ejemplo, IntelliJ IDEA, Eclipse).
3.  Navega al paquete del patrón que te interese.
4.  Encuentra la clase `Main` correspondiente (ej. `MainSingleton`, `MainBuilder`, etc.) y ejecútala para ver el patrón en acción.
