package src.Helpers;

public class ByteArrayConverter {
    private static ByteArrayConverter instance;

    private ByteArrayConverter() {
    }

    public static ByteArrayConverter getInstance() {
        if (instance == null) {
            instance = new ByteArrayConverter();
        }
        return instance;
    }

    public Byte[] convertToObject(byte[] data) {
        int index = 0;
        Byte[] objectData = new Byte[data.length];
        for (byte dataValue : data) {
            objectData[index++] = dataValue;
        }
        return objectData;
    }

    public byte[] convertToPrimitive(Byte[] data) {
        int index = 0;
        byte[] primitiveData = new byte[data.length];
        for (Byte dataValue : data) {
            primitiveData[index++] = dataValue;
        }
        return primitiveData;
    }
}