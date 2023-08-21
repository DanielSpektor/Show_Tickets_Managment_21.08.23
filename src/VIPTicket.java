public class VIPTicket extends Ticket{

    public VIPTicket(Show show, int rowNum, int seatNum, double ticketPrice) {
        super(show, rowNum, seatNum, ticketPrice);
    }

    @Override
    public double calculateTicketPrice() throws Exception {
        double sum = 0;
        for(Ticket ticket : this.getShow().getListOfShowTickets()) {
            sum += ticket.getTicketPrice();
        }
        if(this.getCustomer().getCustomerType() == CustomerType.VIP) {
            return sum - sum * this.getCustomer().getDiscount() / 100;
        }else{
            throw new Exception("Not a VIP Ticket with VIP Customer");
        }
    }
}
