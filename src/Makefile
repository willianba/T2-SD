all:			Client.FSClient.class Server.FSServer.class \
			Server.FSInterfaceImpl.class FSInterface.class

Server.FSInterfaceImpl.class:		Server.FSInterfaceImpl.java FSInterface.class
			@javac Server.FSInterfaceImpl.java

FSInterface.class:	FSInterface.java
			@javac FSInterface.java

Client.FSClient.class:	Client.FSClient.java
			@javac Client.FSClient.java

Server.FSServer.class:	Server.FSServer.java
			@javac Server.FSServer.java

run:			all
			@java Server.FSServer &
			@sleep 1
			@java Client.FSClient

clean:
			@rm -f *.class *~
