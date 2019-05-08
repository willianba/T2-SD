public class ServiceProperties {
    private String[] files;
    private int status;
    private byte[] text;

    public ServiceProperties() {
    }

    public ServiceProperties(String[] files) {
        this.files = files;
    }

    public ServiceProperties(int status) {
        this.status = status;
    }

    public ServiceProperties(byte[] text) {
        this.text = text;
    }

    public void setFiles(String[] files) {
        this.files = files;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setText(byte[] text) {
        this.text = text;
    }

    public String[] getFiles() {
        return this.files;
    }

    public int getStatus() {
        return this.status;
    }

    public byte[] getText() {
        return this.text;
    }
}