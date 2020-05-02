package poly;
//эту же задачу через интерфейсы
public interface Store {
    void save(String value);

    String[] load();
}

