package com.ig.bookingService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private String id;
    private String hotelName;
    private String guestName;
    private int nights;
    private LocalDateTime timeStamp;
}
