all:			FSClient.class FSServer.class \
			FSInterfaceImpl.class FSInterface.class

FSInterfaceImpl.class:		FSInterfaceImpl.java FSInterface.class
			@javac FSInterfaceImpl.java

FSInterface.class:	FSInterface.java
			@javac FSInterface.java

FSClient.class:	FSClient.java
			@javac FSClient.java

FSServer.class:	FSServer.java
			@javac FSServer.java

run:			all
			@java FSServer &
			@sleep 1
			@java FSClient

clean:
			@rm -f *.class *~
