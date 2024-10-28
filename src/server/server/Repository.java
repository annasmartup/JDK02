package server.server;

public interface Repository {
    public void save(String text);
    public String load();
}
