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
