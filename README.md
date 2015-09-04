# Test for using Spring Boot, Spring Loaded and Vaadin

## Starting the project command line
---
```mvn install spring-boot:run```
and
open http://localhost:8080 in the browser

## Starting the project in an IDE
---
Option 1, launch ```spring-boot:run``` from your IDE

Option 2, launch the Application class, in this case you need to

1. Download springloaded.jar (e.g. from http://repo.spring.io/simple/libs-release-local/org/springframework/springloaded/1.2.3.RELEASE/springloaded-1.2.3.RELEASE.jar). You might also have it downloaded already in your Maven cache at ~/.m2/repository/org/springframework/springloaded/1.2.4.RELEASE/springloaded-1.2.4.RELEASE.jar
2. Add the JVM arguments ```-javaagent:/Users/foo/bar/springloaded.jar -noverify``` to your Application launch configuration

##### After starting the project, edit MyUI.java and make some changes. The browser will be updated automatically when you save
