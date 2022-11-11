FROM openjdk:latest
EXPOSE 8080
ARG JAR_FILE=target/gcloud-function.jar
ADD ${JAR_FILE} gcloud-function.jar
ENTRYPOINT ["java","-jar","/gcloud-function.jar"]