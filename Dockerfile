FROM openjdk:8-jdk-alpine
COPY backend-pg2/target/TexterSend-0.0.1-SNAPSHOT.jar /home/BACKTEXTER-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/BACKTEXTER-0.0.1-SNAPSHOT.jar"]

EXPOSE 1012/TCP
