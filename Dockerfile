FROM maven:3.8.5-jdk-11-slim
RUN echo "vm.overcommit_memory=1" >> /etc/sysctl.conf
WORKDIR /data
COPY . .
RUN mvn clean install
RUN ls -la /data/app/target
EXPOSE 3005
ENTRYPOINT ["java","-jar","/data/app/target/app-0.0.1-SNAPSHOT.jar"]