FROM tomcat:10.0.20-jre11-openjdk-slim

ARG PROJECT_SOURCE_DIR

COPY target/$PROJECT_SOURCE_DIR/ /usr/local/tomcat/webapps/ROOT/

EXPOSE 8080

CMD ["catalina.sh", "run"]
