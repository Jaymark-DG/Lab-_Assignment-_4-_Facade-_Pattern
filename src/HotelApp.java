public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("--- Guest Requesting Services via Front Desk ---");
        
        frontDesk.pickUpVehicle("ABC-1234");

        frontDesk.cleanRoom(305);

        frontDesk.requestCart(2);
    }
}
