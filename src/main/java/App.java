import entities.Passenger;
import entities.Ticket;

public class App {
    public static void main(String[] args) {
//        Passenger ps = new Passenger();
//        ps.inputPassengerInfo();
        Ticket tk = new Ticket();
        tk.inputTicketInfo();
        System.out.println(tk);

    }
}