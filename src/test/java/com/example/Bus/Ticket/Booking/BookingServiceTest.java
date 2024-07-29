package com.example.Bus.Ticket.Booking;

import com.example.Bus.Ticket.Booking.Entity.Booking;
import com.example.Bus.Ticket.Booking.Entity.Bus;
import com.example.Bus.Ticket.Booking.Entity.Passengers;
import com.example.Bus.Ticket.Booking.Repository.BookingRepository;
import com.example.Bus.Ticket.Booking.Service.BookingService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BookingServiceTest {

    @Mock
    private BookingRepository bookingRepository;

    @InjectMocks
    private BookingService bookingService;

    @Test
    public void testSaveBooking() {
        Passengers passenger = new Passengers("John Doe", "john@example.com", "password123", "USER");
        Bus bus = new Bus(1, "Bus Name", "From", "To", 100.0, LocalDate.now(), "10:00", "12:00");
        Booking booking = new Booking();
        booking.setPassengers(passenger);
        booking.setBusEntity(bus);
        booking.setNoOfPassengers(1);
        booking.setPaymentMode("Cash");

        when(bookingRepository.save(any(Booking.class))).thenReturn(booking);

        Booking savedBooking = bookingService.saveBooking(booking);

        verify(bookingRepository, times(1)).save(any(Booking.class));
        assertEquals(passenger, savedBooking.getPassengers());
        assertEquals(bus, savedBooking.getBusEntity());
        assertEquals(1, savedBooking.getNoOfPassengers());
        assertEquals("Cash", savedBooking.getPaymentMode());
    }
}