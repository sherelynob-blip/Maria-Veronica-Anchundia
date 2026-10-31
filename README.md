# Maria-Veronica-Anchundia
Taller 3 de Programación: activos de una finca en Java 21 (Grupo 8)
# Taller 2 – Records, enums y clases selladas: los activos de la finca

**Universidad Agraria del Ecuador** · Facultad de Ciencias Agrarias · Computación en Línea
**Asignatura:** Programación 3 (Orientada a Objetos Avanzada) · 4.º semestre · Grupo 8
**Unidad 1 · Tema 1.2:** Diseño avanzado de clases · Semana 2 · Taller grupal 2
**Docente:** Ing. Hamilton Francisco Villamar Barros, MSc.

## 1. Descripción

Modelo en Java 21 de los activos de una finca usando records inmutables, una interfaz sellada (`sealed`) y una enumeración con comportamiento. Un `switch` con pattern matching calcula el valor económico de cada activo y el de la finca completa.

## 2. Estructura del proyecto

Paquete: `semana2.finca`

| Archivo | Descripción |
|---------|-------------|
| `Activo.java` | Interfaz sellada que permite solo `Producto`, `Cultivo` y `Animal` |
| `UnidadMedida.java` | Enum con símbolo y factor a kilos (kg, qq, t) |
| `Producto.java` | Record con validación de precio y unidades no negativos |
| `Cultivo.java` | Record con validación de hectáreas positivas |
| `Animal.java` | Record con validación de peso positivo (reto del grupo) |
| `Valorador.java` | `switch` con pattern matching, sin `default` |
| `Demo.java` | Programa principal con la lista de activos |

## 3. Requisitos

- JDK 21 (usa `record`, `sealed` y `switch` con pattern matching)
- IntelliJ IDEA Community Edition (opcional)
- Git y una cuenta de GitHub

## 4. Cómo ejecutar

**Desde la terminal**, en la carpeta con los archivos `.java`:

```bash
mkdir out
javac -d out *.java
java -cp out semana2.finca.Demo
```

**En IntelliJ IDEA:**

1. File > Open... y elegir la carpeta del repositorio.
2. File > Project Structure > SDK: JDK 21 (Language level 21).
3. Clic derecho en `Demo.java` > Run 'Demo.main()'.

## 5. Salida esperada

Incluye el activo propio del grupo (camarón de Taura). Con configuración regional en español, la coma decimal es correcta.

```
Producto[codigo=PR-001, nombre=Saco de urea 50 kg, precioUnitario=32.5, unidades=40] -> USD 1300.00
Cultivo[codigo=CU-001, nombre=Cacao CCN-51, hectareas=3.5, costoPorHectarea=1800.0] -> USD 6300.00
Animal[codigo=AN-001, especie=Bovino, pesoKg=420.0, precioPorKg=1.85] -> USD 777.00
Animal[codigo=AN-002, especie=Camarón (Taura), pesoKg=1500.0, precioPorKg=4.2] -> USD 6300.00
Valor total de la finca: USD 14677.00
10 qq = 453.6 kg
```

## 6. Reto del grupo

- [x] Validación del peso en `Animal` (el peso debe ser positivo)
- [x] Activo propio de la provincia en `Demo` (camarón de Taura, modelado como `Animal`)

## 7. Integrantes y roles

| Integrante | Rol | Aporte |
|------------|-----|--------|
| Narciso Galarza | Programador de records | Validación de peso en `Animal` y activo de la provincia en `Demo` |
| | | |

## 8. Flujo de trabajo con Git

```bash
git switch -c aporte-nombre          
git add archivo1 archivo2            
git commit -m "Descripción del cambio"
git push -u origin aporte-nombre     
```

Después, abrir un Pull Request hacia `main` para que el grupo lo revise y lo una.

## 9. Honestidad académica

El código fue escrito por el grupo. Si se usó un asistente de inteligencia artificial para resolver un error, se indica en el párrafo de reflexión de Moodle.
