package parcing;

public interface Parkovka {
    boolean add(Avto avto);
    boolean canParkovka(Avto avto);
    Avto replace(String number);
}
