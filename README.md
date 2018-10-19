# Learning the Spring Framework

Currently Working On: \
https://spring.io/guides/tutorials/react-and-spring-data-rest/

Completed Tutorials: \
https://spring.io/guides/gs/rest-service/

## ReactJS & Spring Data REST
* `@Entity` is a JPA annotation that denotes the whole class for storage in a relational table.
* `@Id` and `@GeneratedValue` are JPA annotations to note the primary key and that is generated automatically when needed.
* `@Data` is a Project Lombok annotation that auto-generates getters, setters, constructors, to String, hash, equals and other things. It's essentially cutting down the boilerplate code.
* `@Component` marks the class so that Spring automatically picks it up via `@SpringBootApplication`.
* The `DatabaseLoader` class implements `CommandLineRunner` so that it gets run after all the beans are created and registered.
* `@Controller` marks a class as a Spring MVC Controller.