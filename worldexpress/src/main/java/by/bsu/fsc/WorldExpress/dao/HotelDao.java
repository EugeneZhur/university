package by.bsu.fsc.WorldExpress.dao;

import by.bsu.fsc.WorldExpress.model.Hotel;

import java.util.List;

public interface HotelDao {
    public List<Hotel> getHotelByTourId(int id);
}
