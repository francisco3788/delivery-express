# Delivery Express

Proyecto de práctica de **colecciones y genéricos en Java**.  
Se implementan `ArrayList`, `LinkedList`, `HashSet`, `HashMap` y métodos genéricos para simular pedidos de delivery.

---

## 👥 Integrantes
- Yuly Bastidas
- Danilo Carlosama
- Francisco Molina
---

## ⚙️ Cómo ejecutar

### 1. Compilar
Desde la raíz del proyecto, crea la carpeta `bin` (si no existe) y compila todas las clases:

```bash
mkdir bin
javac -d bin src/main/java/modelo/*.java src/main/java/colecciones/*.java src/main/java/app/*.java


explicación de cada parte

Parte A: Uso de ArrayList y LinkedList para registrar pedidos en orden de llegada e inserción de pedidos urgentes.

Parte B: Uso de HashSet para manejar duplicados.

Parte C: Uso de HashMap para indexar pedidos por cliente y calcular el total gastado.

Parte D: Implementación de método genérico filtrar y pruebas con productos específicos y montos mayores a 50.

