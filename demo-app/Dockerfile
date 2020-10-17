FROM openjdk:11-jre-slim

WORKDIR /opt

RUN adduser --system --group demo-user

COPY --chown=demo-user ./build/libs/demo-app-*.jar ./demo-app.jar

USER demo-user

EXPOSE 8080

#ENTRYPOINT ["java"]

#CMD ["-Djava.security.egd=file:/dev/./urandom", "-jar", "demo-app.jar"]