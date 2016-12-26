package by.bsu.fsc.WorldExpress.service;

import by.bsu.fsc.WorldExpress.model.Hotel;

import java.util.List;

public interface HotelService {
    public List<Hotel> getHotelByTourId(int id);
}
