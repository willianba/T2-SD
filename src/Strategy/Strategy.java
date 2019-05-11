package src.Strategy;

public interface Strategy<T> {
    T execute(String path);
    T execute(byte[] data, String path);
}
