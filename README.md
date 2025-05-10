# Parcial de Objetos II

[![codecov](https://codecov.io/github/unahur-obj2/simulador_vehiculos/graph/badge.svg?token=W0R1Q1C272)](https://codecov.io/github/unahur-obj2/simulador_vehiculos)

## Consideraciones iniciales

- El código entregado **debe compilar obligatoriamente**. Un parcial entregado cuyo código no compila **queda desaprobado automáticamente**.

- Se realizará un control exhaustivo, incluyendo distintas herramientas de análisis estático de código para identificar posibles copias entre las soluciones entregadas.

- La solución debe aplicar **patrones de diseño apropiados** para la problemática planteada.

- Para simplificar, se debe utilizar **el tipo Integer** para representar valores numéricos de las unidades y precios. Para el cálculo del precio simulado debemos utilizar el **primitivo double**.

- El código debe alcanzar **al menos un 70% de cobertura de tests** (coverage).

- No se aceptan entregas fuera de plazo ni que no estén correctamente **subidas al repositorio del classroom de la materia**

- Para aprobar debe cumplir con los requerimientos mínimos de la entrega, además de los ya mencionado anteriormente.

# Simulador de Precios del Automotor

## Contexto

Una concesionaria de autos está desarrollando un sistema para simular precios finales de sus vehículos según distintas combinaciones de equipamiento adicional (levantavidrios eléctricos, estéreo, alarma, pulido especial, etc.).
El precio base del auto puede incrementarse en función de estas mejoras. Se requiere diseñar este sistema aplicando patrones de diseño adecuados, en especial aquellos que favorezcan la extensibilidad del modelo.

## Autos

De cada auto se registra:

- **Precio base**

- **Cantidad de puertas**

- **Velocidad máxima**

- **Superficie**

Además, la concesionaria definió las siguentes reglas de negocio.

- Un auto se considera deportivo si tiene solo 2 puertas y alcanza una velocidad máxima de 160 km/h.
- Un auto se considera veloz si alcanza uns velocidad máxima de 140 km/h.
- Un auto no puede ser reformado, es decir, **nunca cambia la estructura de superficie y puertas**.
- Un auto puede sufrir reformas en el motor, es decir, **puede variar la velocidad máxima**
- La concesionaria obviamente cambiar el precio base de un auto.

## Equipamiento Adicional

Cada equipamiento puede agregarse a un auto aumentando su precio base según su lógica específica. Deben poder combinarse múltiples mejoras y el diseño debe facilitar la incorporación de nuevas mejoras en el futuro.

Los siguientes accesorios ya están definidos:

- **Levantavidrios eléctricos**: Este equipamiento tiene un precio por puerta, y el valor que incrementa al precio del auto resulta del cálculo específico de este equipamiento de acuerdo a la cantidad de puertas del auto.

- **Estéreo**: Tiene un precio fijo de colocación y un precio de cada parlante. Los parlantes siempre se instalan en todas las puertas del auto. El precio que incrementa este equipamiento resulta del cálculo considerando el precio fijo de colocación y la cantidad de puertas.

- **Pulido**: El pulido tiene un precio fijo que aumenta en un 5000 pesos si el auto es veloz, pero este valor de pulido **nunca puede ser mayor a 100000 pesos**. El pulido incrementa el precio del auto en función del precio del pulido (con o sin aumento de 5000) multiplicado la superficie del auto.

- **Alarma**: La alarma tiene un valor fijo que aumenta el precio del auto. Pero si el auto es deportivo aumenta 30000 más.

## Estrategia de cálculo

El sistema debe permitir aplicar distintas estrategias para calcular el precio del auto decorado. Algunas de ellas son:

**PrecioFinal**: retorna el precio total del auto con todos los accesorios configurados.

**PrecioFinalConPorcentajeDescuento**: aplica un descuento (porcentaje) sobre el precio final total.

**PrecioFinalConImporteDescuento**: aplica un descuento (importe fijo) sobre el precio final total.

## Requerimientos

Modelá las clases y/o interfaces necesarias para representar el sistema, aplicando todos los patrones que aplican a esta solución.

### Requerimientos Mínimos para aprobar

1. Implementar la clase Auto
2. Implementar como mínimo 2 accesorios
3. Heredar como mínimo 1 estrategia
4. Desarrollar el simulador
5. Tener al menos 1 test de simualcion

## Requerimientos completos

1.  Realiza la siguiente **simulación de precio** en la clase **Simulador**

### 1.1 Estrategia

    - Precio Final

### 1. 2 Auto

    - Precio Base: precio $5.000.000
    - 4 puertas
    - velocidad máxima: 170 km/h.
    - 5 unidades de superficie

### Accesorios :

    - Levantavidrios de $30.000 por puerta.
    - Pulido: $25000
    - Estereo: Colocación: $15000; Cada parlante: $20000

### Resultado

    - 5315000

2.  Simular con el mismo auto y accesorios pero con la estrategia PrecioFinalConPorcentajeDescuento de 10%. El resultado debe ser: **4783500**

3.  Simular con el mismo auto agregando a los accesorios que ya tenía una alarma, y simula con la estrategia PrecioFinalConImporteDescuento de 200000. El resultado debe ser: **5165000**

## Ayudas

Nos entregan la siguiente interface **Personalizable** y clase abstracta **PrecioFinalStragegy** que obligatoriamente debemos implementar

```
package ar.edu.unahur.obj2.parcial.accesorios;

public interface Personalizable {
    Integer precioConAccesorios(Personalizable auto);

    Boolean esDeportivo();

    Boolean esVeloz();

    Integer getCantidadPuertas();

    public Integer getSuperficie();
}

```

```
package ar.edu.unahur.obj2.parcial.estrategias;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;

public abstract class PrecioFinalStragegy {
    private Personalizable autoPersonalizado;

    public PrecioFinalStragegy(Personalizable autoPersonalizable) {
        this.autoPersonalizado = autoPersonalizable;
    }

    public abstract double precioTotal(Personalizable auto);

    public Personalizable getAutoPersonalizado() {
        return autoPersonalizado;
    }
}

```

## Punto 10

Extender el modelo y agregar el accesorio **Kit Nitro** que aumenta el precio del auto en un valor fijo pero además siempre define al auto como veloz, independientemente de la velocidad máxima que desarrolle.
