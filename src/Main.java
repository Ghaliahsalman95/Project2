import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            BestRoute bestRoute = new BestRoute();
            Scanner input = new Scanner(System.in);
            ArrayList<Route> routes = new ArrayList<Route>();
            bestRoute.setRoutes(routes);
            System.out.println("Please write Pickup:");
            String pick = input.next();
            pick += input.nextLine();
            System.out.println("Please write Destination:");
            String destination = input.next();
            destination += input.nextLine();
            Route routeOne = new Route(pick, destination, 50);
            Route routeTwo = new Route("Route", "destination", 200);//price 200
            Route routethree = new Route("Route", "destination", 15);//15 price
            Route routefour = new Route("Route", "destination", 10);//for test
            routes.add(routeOne);
            routes.add(routeTwo);
            routes.add(routethree);
            routes.add(routefour);
            bestRoute.addRoute(routeOne);
            bestRoute.addRoute(routeTwo);
            bestRoute.addRoute(routethree);
            bestRoute.addRoute(routefour);
            Route shorttRoute = bestRoute.findshortestRoute(routeOne);//must be return routeFour
            if (shorttRoute == null) {
                System.out.println("There is no Shortest route ");
            }
            Car carOne = new Car("CarOne", 5, shorttRoute);
            Car carTwo = new Car("CarTwo", 0, shorttRoute);
            carOne.setRoute(shorttRoute);
            carTwo.setRoute(shorttRoute);
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