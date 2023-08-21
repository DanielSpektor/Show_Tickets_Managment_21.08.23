import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("a","a","a","a",CustomerType.REGULAR,null);
        Customer c2 = new Customer("b","b","b","b",CustomerType.VIP,10);

        Show s1 = new Show("abc");
        Show s2 = new Show("def");

        Ticket t1 = new RegularTicket(s1,3,3,10);
        Ticket t2 = new RegularTicket(s1,2,2,20);
        Ticket t3 = new RegularTicket(s1,1,1,30);
        Ticket t4 = new RegularTicket(s1,4,24,40);

        s1.addTicket(t1);
        s1.addTicket(t2);
        s1.addTicket(t3);
        s1.addTicket(t4);

        System.out.println(s1.getListOfShowTickets());
        s1.removeTicket(t1);
        System.out.println(s1.getListOfShowTickets());















    }








}

