package parcing;import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ParcingTest {
    @Test
    public void whenCanPark() {
        Parking parking = new Parking();
        Avto car = new Car("A456YB", "Mersedes 200");
        Assert.assertTrue(parking.add(car));
        Assert.assertEquals(car, parking.replace(car.number()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenParkingFillAndParkCar() {
        Parking parking = new Parking(1, 0);
        Avto car = new Car("A456YB", "Mersedes 200");
        Avto  car2 = new Car("B102CT", "Honda ");
        parking.add(car);
        parking.add(car2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenParkingFillAndParkTruck() {
        Parking parking = new Parking(1, 1);
        Avto car = new Car("A456YB", "Mersedes 200");
        Avto truck1 = new Truck("B234LO", "Man", 3);
        Avto truck2 = new Truck("B654CK", "Man ", 3);
        parking.add(car);
        parking.add(truck1);
        parking.add(truck2);
    }

    @Test
    public void whenRetrieve() {
        Parking parking = new Parking(3, 0);
        Avto truck = new Truck("B234LO", "Man" ,
                3);
        parking.add(truck);
        Assert.assertThat(parking.replace(truck.number()), Is.is(truck));
    }


}
