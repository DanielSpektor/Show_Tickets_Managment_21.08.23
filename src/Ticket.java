public abstract class Ticket {

    private static int counter = 1;

    private int id;
    private Show show;
    private int rowNum;
    private int seatNum;
    private Customer customer;
    private double ticketPrice;

    public Ticket(Show show, int rowNum, int seatNum, double ticketPrice) {
        this.id = counter++;
        this.show = show;
        this.rowNum = rowNum;
        this.seatNum = seatNum;
        try {
            this.ticketPrice = calculateTicketPrice();
        } catch (Exception e) {
            System.out.println("Not a VIP Ticket, but exception was caught");
        }
    }

    public int getId() {
        return id;
    }

    public Show getShow() {
        return show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public abstract double calculateTicketPrice() throws Exception;


}
