# Conceptos de POO

### Ejercicio 1

**¿Cuáles serían los atributos de la clase *PilotoDeFormula1*? ¿Se te ocurren algunas instancias de esta clase?**

· Atributos: nombre, apellidos, sexo, escuderia, palmares, activo o retirado.
· Instancias: alonso, vettel, hamilton.

### Ejercicio 2

**A continuación tienes una lista en la que están mezcladas varias clases con instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos están escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece cada una de estas instancias y cuál es la jerarquía entre las clases: paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.**

· Clases: (Animal > Perro, Gato, Caballo > Pegaso), Mineral, Persona.

· Instancias: (paula, javier -> Persona), (goofy, pluto, ayudante_de_santa_claus, snoopy, milu, laika -> Perro -> Animal), (garfield, silvestre, tom -> Gato -> Animal), (rocinante, bucefalo, Pegaso -> Caballo -> Animal), (pirita, cuarzo -> Mineral), (pato_lucas -> Animal).

### Ejercicio 3

**¿Cuáles serían los atributos de la clase *Vivienda*? ¿Qué subclases se te ocurren?**

· Atributos: nºhabitaciones, m², amueblada o sin amueblar, nºhabitantes, materialConstruida, gastosMensuales.

· Subclases: Habitante, Propietario.

### Ejercicio 4

**Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5 elementos distintos que intervengan en la liga?**

· Clases: Jugador, Equipo, Aficion, Estadio, Arbitro.

### Ejercicio 5

**Haz una lista con los atributos que podría tener la clase caballo. A continuación haz una lista con los posibles métodos (acciones asociadas a los caballos).**

· Atributos: sexo, raza, edad, porte, temperamento.

· Métodos: come, bebe, duerme, pasea, trota, galopa, seReproduce, relincha.

### Ejercicio 6

**Lista los atributos de la clase *Alumno*. ¿Sería *nombre* uno de los atributos de la clase?. Razona tu respuesta.**

· Atributos: nombre, apellidos, edad, codigoMatricula, curso, clase.

· El atributo nombre sería un atributo de la clase Alumno en el caso de que ésta no tuviera ninguna superclase, ya que un alumno ha de tener nombre, pero si existiera una clase superior como por ejemplo Persona, entonces el nombre iría en esta clase y no en Alumno.

### Ejercicio 7

**¿Cuáles serían los atributos de la clase *Ventana* (de ordenador)?, ¿cuáles serían los métodos?. Piensa en las propiedades y en el comportamiento de una ventana de cualquier programa.**

· Atributos: tamaño, apariencia, visibilidad.

· Métodos: minimiza, maximiza, restaura, cambiaColor, cierra.

