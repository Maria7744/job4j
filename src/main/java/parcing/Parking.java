package parcing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parking implements Parkovka {

    private static final int DEFAULT_CAR_PLACES = 10;

    private static final int DEFAULT_TRUCK_PLACES = 5;

    private static final int CAR_SIZE = 1;

    private final int carPlaces;

    private final int truckPlaces;

    private List<Avto> cars = new ArrayList<>();

    private List<Avto> trucks = new ArrayList<>();

    public Parking() {
        this.carPlaces = DEFAULT_CAR_PLACES;
        this.truckPlaces = DEFAULT_TRUCK_PLACES;
    }

    public Parking(int carPlaces, int truckPlaces) {
        this.carPlaces = carPlaces;
        this.truckPlaces = truckPlaces;
    }

    @Override
    public boolean add(Avto avto) {
        if (!canParkovka(avto)) {
            throw new IllegalArgumentException();
        }
        if (avto.size() == CAR_SIZE) {
            cars.add(avto);
        } else {
            if (trucks.size() < truckPlaces) {
                trucks.add(avto);
            } else {
                IntStream.range(0, avto.size()).forEach(n -> cars.add(avto));
            }
        }
        return true;
    }

    @Override
    public Avto replace(String number) {
        List<Avto> carVehicles = cars.stream().filter(c -> c.number().equals(number)).
                collect(Collectors.toList());
        if (carVehicles.size() > 0 && cars.removeAll(carVehicles)) {
            return carVehicles.get(0);
        }
        List<Avto> truckVehicle = trucks.stream().filter(t -> t.number().equals(number)).collect(Collectors.toList());
        if (truckVehicle.size() > 0 && trucks.removeAll(truckVehicle)) {
            return truckVehicle.get(0);
        }
        return null;
    }

    @Override
    public boolean canParkovka(Avto avto) {
        if (avto.size() == CAR_SIZE && cars.size() == carPlaces) {
            return false;
        }
        if (avto.size() != CAR_SIZE && (trucks.size() == truckPlaces && avto.size() > (carPlaces - cars.size()))) {
            return false;
        }
        return true;
    }

}
