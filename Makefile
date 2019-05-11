all:
			@javac src/Server/FSServer.java src/Client/FSClient.java

clean:
			@rm -f src/*.class src/**/*.class
