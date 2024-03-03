import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Route routeOne = new Route("Route!", "destination1", 50);
            Route routeTwo = new Route("Route !!", "destination2", 200);
            Car carOne = new Car("CarOne", 5, routeOne);
            Car carTwo = new Car("CarTwo", 0, routeTwo);
            carOne.setRoute(routeOne);
            carTwo.setRoute(routeTwo);
            ArrayList<Passenger> passengers = new ArrayList<Passenger>();
            Passenger passengerS = new SubscribersP("Ghalia h", "12345", carOne);
            passengerS.setCar(carOne);
            Passenger passengerNon = new NonSubscribersP("Ghalia h", "12345", carOne, true);
            passengerNon.setCar(carTwo);
            for (Passenger p : passengers) {
                p.displayInfor();
            }
        } catch (Exception e) {

            System.out.println('\t' + "ALERT::::" + e.getMessage());
        }
    }
}