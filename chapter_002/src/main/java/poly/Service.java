package poly;
//сам класс который использует хранилище
public class Service {
   // private DbStore store;
   private Store store;
    public Service(DbStore store) {
        this.store = store;
    }

    public void extract() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        //после добавления FileStore заменим
       // DbStore store = new DbStore(); на

       // Осталось отвязать сам сервис
       // DbStore store = new FileStore();
        Store store = new FileStore();

       // Service service = new Service(store);
       // service.extract();
    }
}

