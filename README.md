# Práctica de Árbol Binario de Búsqueda

## 📌 Información General

- **Título:** Práctica de Árbol Binario de Búsqueda
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Juan Ortiz
- **Fecha:** 19/6/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa un Árbol Binario de Búsqueda (ABB) en Java, permitiendo:
- Inserción de nodos
- Recorridos InOrden y PreOrden
- Cálculo de altura y peso del árbol
- Cálculo de factores de equilibrio
- Detección de nodos desequilibrados

El árbol almacena valores enteros y permite visualizar sus propiedades y estructura.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac -d bin src/App.java src/materia/controllers/ArbolBinario.java src/materia/models/Node.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java -cp bin App
    ```

---

## 🧑‍💻 Ejemplo de Salida

```plaintext
Nombre: Juan Ortiz

Peso del arbol: 8
Altura del arbol: 4

Arbol InOrden
9 14 17 19 23 50 54 76
Arbol InOrden con alturas
9 h:2, 14 h:1, 17 h:3, 19 h:1, 23 h:2, 50 h:4, 54 h:1, 76 h:2, 
Arbol InOrden con factores de equilibrio
9 eq:-1, 14 eq:0, 17 eq:0, 19 eq:0, 23 eq:1, 50 eq:1, 54 eq:0, 76 eq:1,

Arbol esta equilibrado: true
Agregando valor:15

Arbol InOrden con factores de equilibrio
9 eq:-2, 14 eq:-1, 15 eq:0, 17 eq:1, 19 eq:0, 23 eq:1, 50 eq:2, 54 eq:0, 76 eq:1,        
Nodos desequilibrados:
9 eq:-2, 50 eq:2,
```

---

## Imagen de consosla
![alt text](image.png)