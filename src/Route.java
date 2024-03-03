public class Route {
    private String  startPickup,destination;
    private float price;

    public Route(String startPickup, String destination) {
        this.startPickup = startPickup;
        this.destination = destination;

    }

    public Route(String startPickup, String destination, float price) {
        this.startPickup = startPickup;
        this.destination = destination;
        this.price = price;
    }

    public Route() {
    }

    public String getStartPickup() {
        return startPickup;
    }

    public void setStartPickup(String startPickup) {
        this.startPickup = startPickup;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {

        this.destination = destination;



    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price=price;

    }
}
