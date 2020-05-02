package poly;
//добавим еще класс
public class FileStore /*extends DbStore */implements Store {
    // @Override
    //Теперь хранилища не привязаны друг к другу. Осталось отвязать сам сервис.
    public void save(String value) {

        //super.save(value);
    }

    // @Override
    public String[] load() {
        //return super.load();
        return new String[0];
    }
}


