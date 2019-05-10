package src;

public enum Services {
    LS("ls"),
    MKDIR("mkdir"),
    CREATE("create"),
    UNLINK("unlink"),
    WRITE("write"),
    READ("read");

    private final String service;

    Services(String service) {
        this.service = service;
    }

    public String getService() {
        return this.service;
    }
}
