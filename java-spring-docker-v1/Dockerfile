From centos:1.0

ENV JAVA_VERSION 8u161
ENV BUILD_VERSION b14
 
COPY ./target/java-spring-docker.jar /tmp/
WORKDIR /tmp

EXPOSE 9090
#CMD ["mvn", "spring-boot:run"]
#EXPOSE 8080
 
#install Spring Boot artifact
VOLUME /tmp
ADD /maven/java-spring-docker-0.0.1-SNAPSHOT.jar java-spring-docker.jar
RUN sh -c 'touch /java-spring-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/java-spring-docker.jar"]
