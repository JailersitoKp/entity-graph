# Introducción a JPA Entity Graph con Spring Boot

### Requisitos
* Java 11
* Git
* Maven
* Docker
* Postman o cURL
#### Adicionales:
 * Eclipse
 * Spring Tools for Eclipse

### Clonar repositorio
```
git clone https://github.com/JailersitoKp/entity-graph.git
```

### Iniciar proyecto con docker
```
mvn clean package
cd entity-graph
sudo docker-compose -f docker-compose.yml up --build (Linux)
docker compose -f docker-compose.yml up --build (Windows)
```

### H2 Database
* URL Acceso:
  http://localhost:8080/h2-console
  
#### Configuración acceso:
* JDBC URL: jdbc:h2:mem:jpaegdb
* User Name: sa
* Password: password

### Postman
Importar archivo: jpa-entity-graph/postman/jpa-entity-graph.postman_collection.json
Verificar realizando petición: GET artistByName

### curl
Ver archivo: jpa-entity-graph/curl/cURLs.txt

### Diagrama Entidad Relación (DER)
Ver archivo: jpa-entity-graph/doc/DER.jpg

### Diagrama de clases
Ver archivo: DiagramaDeClases.jpg

## Eclipse
### Importar proyecto:
File -> Import -> General -> Projects from Folder or Archive
Directory -> workspace-xxxxx/entity-graph
Finish

### Iniciar proyecto con eclipse
Clik (derecho) en proyecto -> Run As -> Spring Boot App
