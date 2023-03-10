package TicketManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

    @Test
    public void testsSortTickets() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MOW", "LED", 200, 75);
        Ticket ticket2 = new Ticket(2, "MOW", "LED", 150, 80);
        Ticket ticket3 = new Ticket(3, "LED", "KUF", 300, 90);
        Ticket ticket4 = new Ticket(4, "MOW", "LED", 300, 85);
        Ticket ticket5 = new Ticket(5, "MOW", "LED", 210, 86);
        Ticket ticket6 = new Ticket(6, "LAX", "LHR", 900, 625);
        Ticket ticket7 = new Ticket(7, "MOW", "LAX", 800, 700);
        Ticket ticket8 = new Ticket(8, "MOW", "LED", 250, 95);
        Ticket ticket9 = new Ticket(9, "GOJ", "MOW", 500, 60);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket2, ticket1, ticket5, ticket8, ticket4};
        Ticket[] actual = manager.findAll("MOW", "LED");

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testsSortOneTicket() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MOW", "LED", 200, 75);
        Ticket ticket2 = new Ticket(2, "MOW", "LED", 150, 80);
        Ticket ticket3 = new Ticket(3, "LED", "KUF", 300, 90);
        Ticket ticket4 = new Ticket(4, "MOW", "LED", 300, 85);
        Ticket ticket5 = new Ticket(5, "MOW", "LED", 210, 86);
        Ticket ticket6 = new Ticket(6, "LAX", "LHR", 900, 625);
        Ticket ticket7 = new Ticket(7, "MOW", "LAX", 800, 700);
        Ticket ticket8 = new Ticket(8, "MOW", "LED", 250, 95);
        Ticket ticket9 = new Ticket(9, "GOJ", "MOW", 500, 60);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.findAll("LAX", "LHR");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testsSortNoTicket() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MOW", "LED", 200, 75);
        Ticket ticket2 = new Ticket(2, "MOW", "LED", 150, 80);
        Ticket ticket3 = new Ticket(3, "LED", "KUF", 300, 90);
        Ticket ticket4 = new Ticket(4, "MOW", "LED", 300, 85);
        Ticket ticket5 = new Ticket(5, "MOW", "LED", 210, 86);
        Ticket ticket6 = new Ticket(6, "LAX", "LHR", 900, 625);
        Ticket ticket7 = new Ticket(7, "MOW", "LAX", 800, 700);
        Ticket ticket8 = new Ticket(8, "MOW", "LED", 250, 95);
        Ticket ticket9 = new Ticket(9, "GOJ", "MOW", 500, 60);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("MOW", "LHR");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testsSortTickets2() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);


        Ticket ticket1 = new Ticket(1, "MOW", "LED", 150, 80);
        Ticket ticket2 = new Ticket(2, "MOW", "LED", 200, 75);
        Ticket ticket3 = new Ticket(3, "MOW", "LED", 210, 86);
        Ticket ticket4 = new Ticket(4, "MOW", "LED", 250, 95);
        Ticket ticket5 = new Ticket(5, "MOW", "LED", 300, 85);
        Ticket ticket6 = new Ticket(6, "LED", "KUF", 300, 90);
        Ticket ticket7 = new Ticket(7, "GOJ", "MOW", 500, 60);
        Ticket ticket8 = new Ticket(8, "MOW", "LAX", 800, 700);
        Ticket ticket9 = new Ticket(9, "LAX", "LHR", 900, 625);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Ticket[] actual = manager.findAll("MOW", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }

}