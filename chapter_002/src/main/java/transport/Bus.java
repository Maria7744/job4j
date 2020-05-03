package transport;

import java.io.OutputStream;

public class Bus implements Transport {
    private int passengers=0;

    @Override
    public void run() {


    }

    @Override
    public void passengers(int passengersCount) {
        this.passengers = passengersCount;

    }

    @Override
    public int price(int toplivo) {
        int way= 5;
        return  way * toplivo;
    }
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(bus.price(8));
    }
}
