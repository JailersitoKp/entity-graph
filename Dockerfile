FROM openjdk:11-slim
COPY target/jpa-entity-graph.jar jpa-entity-graph.jar
ENTRYPOINT ["java","-jar","/jpa-entity-graph.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]