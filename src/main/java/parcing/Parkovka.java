package parcing;

public interface Parkovka {
    boolean add(Avto avto);
    boolean CanParkovka(Avto avto);
    Avto replace(String number);
}
