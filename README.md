# 🗺️ LlanquihueTourApp

## 📌 Descripción

LlanquihueTourApp es una aplicación desarrollada en Java que representa distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

En esta etapa del proyecto se implementó una jerarquía de clases utilizando herencia y composición, permitiendo reutilizar código y modelar de mejor manera los distintos tipos de servicios turísticos.

---

## 🎯 Objetivo de esta semana

Implementar una jerarquía de clases orientada a objetos aplicando los siguientes conceptos:

- Herencia.
- Composición.
- Encapsulamiento.
- Constructores.
- Getters y Setters.
- Sobrescritura del método `toString()`.
- Organización del proyecto mediante paquetes.

---

## 📁 Estructura del proyecto

```
src
└── main
    └── java
        ├── model
        │   ├── Guia.java
        │   ├── ServicioTuristico.java
        │   ├── RutaGastronomica.java
        │   ├── PaseoLacustre.java
        │   └── ExcursionCultural.java
        │
        ├── data
        │   └── GestorServicios.java
        │
        ├── service
        │   └── ServicioService.java
        │
        ├── util
        │   └── Validador.java
        │
        └── ui
            └── Main.java
```

---

## 📚 Clases creadas

### model

- **Guia:** representa al guía encargado de un servicio turístico.
- **ServicioTuristico:** superclase que contiene la información común de todos los servicios.
- **RutaGastronomica:** representa una ruta gastronómica.
- **PaseoLacustre:** representa un paseo por el Lago Llanquihue.
- **ExcursionCultural:** representa una excursión a un lugar histórico o cultural.

### data

- **GestorServicios:** crea las instancias de prueba y muestra la información.

### service

- **ServicioService:** muestra la información de los servicios turísticos.

### util

- **Validador:** realiza validaciones básicas antes de mostrar los servicios.

### ui

- **Main:** ejecuta la aplicación.

---

## ▶️ Instrucciones para ejecutar Main

1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar que Maven sincronice el proyecto.
3. Abrir la clase `Main.java` ubicada en el paquete `ui`.
4. Ejecutar el método `main()`.
5. La información de los servicios turísticos será mostrada por consola.

---

## Autor

Ignacio Nicolás Arriagada Guzmán

Estudiante Analista Programador Computacional

Duoc UC
