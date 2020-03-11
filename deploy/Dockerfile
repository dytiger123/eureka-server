FROM myharbor.com/library/tomcat:8.5
MAINTAINER dytiger
COPY testEurekaServer.war /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat/bin/
ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh","run"]