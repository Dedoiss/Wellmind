### 📦 1. pom.xml - Dependências Maven

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
    </parent>
    
    <groupId>com.wellmind</groupId>
    <artifactId>wellmind-backend</artifactId>
    <version>1.0.0</version>
    
    <properties>
        <java.version>17</java.version>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.opencv</groupId>
            <artifactId>opencv</artifactId>
            <version>4.8.0</version>
        </dependency>
    </dependencies>
</project>
```

### ⚙️ 2. application.properties

```properties
spring.application.name=wellmind
spring.datasource.url=jdbc:postgresql://localhost:5432/wellmind
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

### 🚀 3. WellMindApplication.java

```java
package com.wellmind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WellMindApplication {
    public static void main(String[] args) {
        SpringApplication.run(WellMindApplication.class, args);
    }
}
```

---

**📄 Para ver o código completo de todas as classes (Models, Repositories, Services, Controllers), acesse as notas:**

1. Clique no ícone **📝 Notes** no canto superior direito
2. Abra as notas:
   - `wellmind_java_backend` (Parte 1)
   - `wellmind_java_backend_part2` (Parte 2)
   - `wellmind_java_backend_part3` (Parte 3)
   - `wellmind_java_backend_part4` (Parte 4)
   - `wellmind_java_backend_part5` (Parte 5)
