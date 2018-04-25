From centos:latest

ENV JAVA_VERSION 8u161
ENV BUILD_VERSION b14
 
COPY ./target/java-spring-docker.jar /tmp/
WORKDIR /tmp

# Upgrading system
RUN yum -y upgrade
RUN yum -y install wget
 
# Downloading & Config Java 8
RUN wget -c --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u131-b11/d54c1d3a095b4ff2b6607d096fa80163/jdk-8u131-linux-x64.rpm
RUN yum -y install jdk-8u131-linux-x64.rpm java
RUN alternatives --install /usr/bin/java jar /usr/java/latest/bin/java 200000
RUN alternatives --install /usr/bin/javaws javaws /usr/java/latest/bin/javaws 200000
RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 200000


EXPOSE 9090
#CMD ["mvn", "spring-boot:run"]
#EXPOSE 8080
 
#install Spring Boot artifact
#VOLUME /tmp
#ADD /maven/java-spring-docker-0.0.1-SNAPSHOT.jar java-spring-docker.jar
#RUN sh -c 'touch /java-spring-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/java-spring-docker.jar"]
