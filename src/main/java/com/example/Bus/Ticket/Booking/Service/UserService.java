package com.example.Bus.Ticket.Booking.Service;

import com.example.Bus.Ticket.Booking.DTO.UserDto;
import com.example.Bus.Ticket.Booking.Entity.Passengers;

public interface UserService {

    //to collect the passenger information from Entity to Database
    Passengers save (UserDto userDto);
}