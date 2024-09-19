DDS - Práctica Integradora - Modelo de Datos & Persistencia 

Integrantes:
  - Tiscornia, Matías José
  - Borquez Belli, Pablo Joaquín

JUSTIFICACIONES: Diagrama Entidad Relación, Tinderizr

- ManyToMany: Decidimos aplicar un ManyToMany para tag y perfil puesto que son caracteristicas preestablecidas
como "Practica Tenis", "Le gusta el Voley", las cuales se van a repetir en varios perfiles y un perfil puede tener muchas 
de ellas.

- restriccion_matcheo: Pensamos que seria necesario crear una entidad que deje definido que tipos de usuario
pueden matchear para cada dominio, de forma que si estas en el dominio de las Bandas, un guitarrista no pueda
matchear con un Inversor del Dominio de las Startups.

- cuestionario_busqueda y busqueda: Para la parte de busqueda nos acordamos del modelo de formulario, e implementamos algo similar teniendo 3 entidades: cuestionario_busqueda, los tags y busqueda. 
La idea es que para cada dominio exista un cuestionario_busqueda con todos los tags posibles y en la busqueda esten solo los tags que nos interesa filtrar

JUSTIFICACIONES: Diagrama Entidad Relación, Generación de Rutinas

- Claves subrogadas: Nos parecio necesario agregar un ID a todas las entidades.

- Medios de contactos: Decidimos no persistir los contactos que tienen cada uno de los deportistas, ya que no nos parecio relevante contar con esos datos para el gimnasio.

- Interfaz: Como las clases que la implementan no tienen atributos, se realizo un mapeo por interface stateless.

- Clases recursivas: Hay dos entidades que son recursivas; rutina, apunta a si misma pero es opcional ya que la primera vez no va a contener una rutina anterior, y entrenamiento, con cardinalidad obligatoria ya que tiene que contener el dia siguiente.

- Un deportista podria estar en la DB, pero no estar en actividad (por lesion o no tener una rutina establecida aún), por eso no siempre se relaciona con la entidad rutina.
