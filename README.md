# JPATutorial
Java Persistence API is a collection of classes and methods to persistently store the vast amounts of data into a database.

Used Maven build tool for this project

<h2>Part - 1</h2>
Part-1 contains basic CRUD process to MySql db with <b>EclipseLink</b> implementation
<ul>
  <li>Used EntityManager for getting EntityTransaction abstract interface</li>
  <li>EntityTransaction helps us to begin and commit transaction </li>
</ul>
<hr>
<h2>Part - 2</h2>
Part-2 contains basic CRUD process to MySql db with <b>Hibernate</b> implementation
<ul>
  <li>Used EntityManager for getting EntityTransaction abstract interface</li>
  <li>EntityTransaction helps us to begin and commit transaction </li>
</ul>
<hr>
<h2>Part - 3</h2>
Part-3 contains relations between entities. There are 2 types of relationships between entities, unidirectional and bidirectional.
In a <b>unidirectional relationship</b>, only one entity has a relationship field or property that refers to the other. <br/>
In a <b>bidirectional relationship</b>, each entity has a relationship field or property that refers to the other entity. Through the relationship field or property, an entity class’s code can access its related object. If an entity has a related field, the entity is said to “know” about its related object.
<ul>
  <li> <b>@OneToOne</b> -> Employee to ParkingSpace </li>
  <li> <b>@OneToMany</b> -> Employee to Phone  </li>
  <li> <b>@ManyToOne</b> -> Employee to Department </li>
  <li> <b>@ManyToMany</b> -> Employee to Project </li>
</ul>
<hr>
