# Llanquihue Tour

## Descripción del proyecto

Llanquihue Tour es una aplicación desarrollada en Java que permite gestionar información de servicioTuristicos turísticos de la comuna de Llanquihue. El sistema lee datos desde un archivo de texto, crea objetos de tipo Tour y los almacena en una colección ArrayList para posteriormente mostrarlos y realizar búsquedas simples.

## Estructura del proyecto

```text
LlanquihueTourApp
│
├── pom.xml
│
└── src
    └── main
        ├── java
        │   ├── model
        │   │   └── Tour.java
        │   │
        │   ├── data
        │   │   └── GestorDatos.java
        │   │
        │   ├── service
        │   │   └── TourService.java
        │   │
        │   └── ui
        │       └── Main.java
        │
        └── resources
            └── servicioTuristicos.txt
```

## Descripción de las clases

### Tour.java

Representa la entidad Tour y almacena la información de cada recorrido turístico.

### GestorDatos.java

Se encarga de leer el archivo de datos, crear los objetos Tour y almacenarlos en una colección ArrayList.

### TourService.java

Contiene métodos para mostrar y buscar servicioTuristicos dentro de la colección.

### Main.java

Clase principal encargada de ejecutar el programa y probar sus funcionalidades.

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar a que Maven cargue la configuración del proyecto.
3. Verificar que el archivo `servicioTuristicos.txt` se encuentre dentro de `src/main/resources`.
4. Abrir la clase `Main.java`.
5. Ejecutar el método `main()`.
6. Revisar los resultados en la consola.

## Autor

Ignacio Nicolás Arriagada Guzmán

Analista Programador Computacional

Duoc UC
