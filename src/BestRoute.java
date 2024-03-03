import java.util.ArrayList;

public class BestRoute {
    private ArrayList<Route> routes;

    public BestRoute(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public BestRoute() {
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }
public void addRoute(Route route){
        routes.add(route);
}
    public Route findshortestRoute(Route route) {
        Route route1 = routes.get(0);
        if(routes.isEmpty())return null;
        for (Route r : routes) {
            if (r.getDestination().equalsIgnoreCase(route.getDestination())
                    && r.getStartPickup().equalsIgnoreCase(route.getStartPickup()) &&
                    r.getPrice() < route.getPrice()) {
                route1 = r;
            }
        }

        return route1;
    }


}
