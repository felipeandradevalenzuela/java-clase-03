## Ejercicios clase 03

## Ejercicio 1 💡

1. Crear la interface Precedable<T> con un método public int precedeA(T t). 
2. Crear la clase Persona, con los atributos String nombre, e int dni, sus métodos de acceso y los constructores que consideres adecuados. 
3. Hacer que Persona implemente Precedable<Persona>, luego sobreescribir el método int precedeA(Persona t). 
4. Establecer un criterio de precedencia para implementar el método anterior. Podría ser que una persona precede a otra si su DNI es menor, o su nombre es alfabéticamente menor, etcétera. 
5. Crear la clase SortUtil con el método public static <T> ordenar(Precedable<T> arr[]).
6. Dentro del método anterior desarrollar el algoritmo de la burbuja para ordenar el array. 
7. Discusión: El método ordenar, ¿puede ordenar un array de cualquier tipo de dato? 8. Crear un programa, declarar un array con varias personas, ordenarlo y mostrarlo. 
9. Crear la clase Celular, con los atributos: número y titular, implementar 
Precedable<Celular> y proceder del mismo modo que lo hicimos con Persona a partir del punto anterior. 

- [ ] Completado

## Ejercicio 2 💡

Discusión: si quisiéramos cambiar el criterio de precedencia entre dos personas o dos celulares, ¿qué deberíamos hacer? ¿Cuán extensible y/mantenible resulta la solución de ordenamiento que desarrollamos en el ejercicio anterior? ¿Cómo se podría mejorar?


- [ ] Completado
