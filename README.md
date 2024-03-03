# F20AN Vulnerable Application

The application intentionally uses the vulnerable Log4j 2.14.1 release to demonstrate the vulnerability.

## Dependencies
1. Ubuntu 20.04.06 LTS
2. Java release 1.8.0_181
3. Maven 3.6.3

## Setup
### Installing Java (vulnerable version)

Run the following commands:
```
wget https://repo.huaweicloud.com/java/jdk/8u181-b13/jdk-8u181-linux-x64.tar.gz
sudo mkdir /opt/jdk
sudo tar -zxf jdk-8u181-linux-x64.tar.gz -C /opt/jdk
sudo update-alternatives --install /usr/bin/java java /opt/jdk/jdk1.8.0_181/bin/java 100
sudo update-alternatives --install /usr/bin/javac javac /opt/jdk/jdk1.8.0_181/bin/javac 100
sudo update-alternatives --display java
sudo update-alternatives --display javac
sudo update-alternatives --set /opt/jdk/jdk1.8.0_181/bin/java
```

Now edit the file `~/.profile` and add the lines:
```
JAVA_HOME="/opt/jdk/jdk1.8.0_181"
PATH="$JAVA_HOME/bin:$PATH"
export PATH
```

Now you can check if it has installed properly:
```
java -version
```

### Installing Maven (build system)
Run the following commands:
```
wget https://mirrors.estointernet.in/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
tar -xvf apache-maven-3.6.3-bin.tar.gz
mv apache-maven-3.6.3 /opt/
```

Now edit the file `~/.profile` and add the lines:
```
M2_HOME='/opt/apache-maven-3.6.3'
PATH="$M2_HOME/bin:$PATH"
export PATH
```

## Building
To compile the application run the following command:
`mvn clean compile assembly:single`
This will build the jar file (with the libraries included)

To run this jar file run the following command:
`mvn clean compile assembly:single`
