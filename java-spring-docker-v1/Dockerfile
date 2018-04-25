From java:new

ENV JAVA_VERSION 8u31
ENV BUILD_VERSION b13
 
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
