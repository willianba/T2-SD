# Java RMI (T2-SD)
Java RMI program for distributed systems class @ PUCRS
## Usage
### Make

Run `make` to compile all files.
Also can use `make clean` to clear all compiled files.

### Run Server
`java -Djava.rmi.server.hostname=<IP> FSServer`

### Run Client
`java FSClient <SERVER-IP> <SERVICE> <TEXT>(Write only) <PATH>`

- `SERVER-IP` remains to the IP which the server exposed when it was started;
- `SERVICE` is the services that are into `FSInterface`;
- `TEXT` is utilized only with `write` service;
- `PATH` is the path to run the desired service. When root is wanted, use `<SERVICE> .`.
