import java.time.LocalDate;
import java.util.ArrayList;


public class Show {

    private static int counter = 1;
    private int id;
    private String name;
    private LocalDate showDate;
    private ArrayList<Ticket> listOfShowTickets;

    public Show(String name) {
        this.id = counter++;
        this.name = name;
        this.showDate = LocalDate.now();
        this.listOfShowTickets = new ArrayList<Ticket>();

    }

    public int getId() {
        return id;
    }

    public ArrayList<Ticket> getListOfShowTickets() {
        return listOfShowTickets;
    }

    public void setListOfShowTickets(ArrayList<Ticket> listOfShowTickets) {
        this.listOfShowTickets = listOfShowTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public void addTicket(Ticket ticket){
        this.listOfShowTickets.add(ticket);
    }

    public void removeTicket(Ticket ticket){
        this.listOfShowTickets.remove(ticket);
    }

    public void calculateTotalTcketsPrice(){
        double sum = 0;
        for(Ticket ticket : this.listOfShowTickets){
            sum += ticket.getTicketPrice();
        }
    }


}
