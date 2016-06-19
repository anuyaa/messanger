# add tomcat path
export CATALINA_HOME=/usr/local/tomcat
export PATH=$PATH:$CATALINA_HOME/bin
#run tomcat
* cd $CATALINA_HOME/bin
* ./startup.sh
* username : root, password : root for application manager. It is specified in $CATALINA_HOME/conf/tomcatusers.xml

#add maven
export MAVEN_HOME=export MAVEN_HOME=/Users/ankitamuley/Downloads/SoftExe/maven-messanger
export PATH=$PATH:$MAVEN_HOME/bin

#run mvn goal from messanger directory
mvn clean install

#upload the war generated to tomcat
#deploy it