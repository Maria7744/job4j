package oopPonigeniePovishenie;

public class Colleg {
    public static void main(String[] args) {
        //В нем сделайте приведение объекта Freshman к Student, а потом к Object.
        // создаем объекта класса FreshMan.
        FreshMan freshMan = new FreshMan();
        //Теперь этот объект можно записать в переменную с типом Student и Object.
        // делаем приведение к типу родителя Student.
        Student student = freshMan;
        // делаем приведение к типу родителя Object.
        Object obj = freshMan;
        // Приведение типа при создании объекта.
        Object ocar = new FreshMan();
        // Приведение типа за счет повышение по иерархии.
        FreshMan carFromObject = (FreshMan) ocar;


}

    }

