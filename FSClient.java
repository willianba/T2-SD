import java.rmi.Naming;

class FSClient {
    public static void main (String[] argv) {
        try {
            FSInterface fileBrowser = (FSInterface) Naming.lookup ("//localhost/FileBrowser");
            // need to implements methods calls here
        } catch (Exception e) {
            System.out.println ("FSClient failed:");
            e.printStackTrace();
        }
    }
}

