**Spring Core Interview Questions**
1) What is dependency Injection and types of dependency injection?

2) What is Autowiring and its strategies?

3) Differences between setter vs constructor injection?

4) Different annotations come across in development?
     * @Autowired
     * @Qualifier 
     * @Primary
     * @scope
     * @configuration
     * @Bean
     * @propertySource
     * @Import
     * @ImportResource
     * @Value
     * @Component
     * @Controller
     * @Repoistory
     * @Service

5) Differences between BeanFactory and ApplicationContext?

6) How to represent Java class as spring bean?
  
    * XML Configuration

    * @Bean 

    * Stero type annotations

7) Spring Container scopes

8) When to use singeton and prototype ?

     Select DAO Class >>>>>>> Singleton  >>>>>>>>>>>> Common to everyone to select the data from database

     Non-Select DAO Class >>>>> Prototype >>>>>>>>>>> It shouldn't be common for everyone for inserting/updating/deleting data from database.

9) Can we represent the predefined java class as spring bean or not?

10) How to exclude some classes from component scan?
