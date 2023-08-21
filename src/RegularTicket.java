public class RegularTicket extends Ticket{

    public RegularTicket(Show show, int rowNum, int seatNum, double ticketPrice) {
        super(show, rowNum, seatNum, ticketPrice);
    }

    @Override
    public double calculateTicketPrice() throws Exception {
        double sum = 0;
        for(Ticket ticket : this.getShow().getListOfShowTickets()){
            sum += ticket.getTicketPrice();
        }
        return sum;
    }


}
