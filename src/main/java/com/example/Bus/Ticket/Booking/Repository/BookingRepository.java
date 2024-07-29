package com.example.Bus.Ticket.Booking.Repository;

import com.example.Bus.Ticket.Booking.Entity.Booking;
import com.example.Bus.Ticket.Booking.Entity.PassengerDetail;
import com.example.Bus.Ticket.Booking.Entity.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {

    //Method to findByBookingId
    Optional<Booking> findByBookingId(int bookingId);

    //Method to findByPassenger
    List<Booking> findByPassengers(Passengers passengers);

    //Method to get travelPassengers Details
    List<Booking> findByPassengerDetails(PassengerDetail passengerDetail);


}
