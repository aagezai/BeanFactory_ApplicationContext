# BeanFactory_ApplicationContext
This project is for practice purpose only
# It's target is to implement how to use Bean configration by xml and class configration.
    points
    1. we need to configure the pom.xml to have spring context dependency
    2.for xml config
        we need to metadata head and bean config
    3. for class config we need only AppConfig class annotation @Configration 
    and @Bean at the method which creates a bean 
    4. refresh maven is good for compilor error
    creating a bean in main class
    5. ApplicationContext
    6. BeandFactory 
# Scope of creation of a bean
   1 singleton the default one single instance per application 
   2. prototype for every creattion of a bean different instance cration.
   3. request scope, session, golobal-sesssion, Application scope.
   note: we need to add to the xml configration at bean config scope="prototype" in class config just assing @Scope"prototype"
# outowiring using xml configration
  ** Its basic idea is just have 4 ways of autowiring in xml
autowire="byName" : Autowiring using property name. If a bean found with same name as the property of other bean, this bean will be wired into other beans property
autowire="byType" : If a bean found with same type as the type of property of other bean, this bean will be wired into other beans property
autowire="constructor" : If a bean found with same type as the constructor argument of other bean, this bean will be wired into other bean constructor
autowire="no" : No Autowiring. Same as explicitly specifying bean using ‘ref’ attribute
  
# overall was good practice 

-----------------------------------------XXXXX-------------------------------
