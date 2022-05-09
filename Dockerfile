FROM adoptopenjdk/openjdk11:alpine-jre
Run  mkdir -p /opt/app
WORKDIR /opt/app
COPY target/spring-boot-jpa.jar /opt/app
ENTRYPOINT ["java","-jar","spring-boot-jpa.jar"]