FROM openjdk:8
COPY target/spring-cloud-kubernetes-config-example-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENV CONFIG_DIR="/etc/company/config"
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /app.jar