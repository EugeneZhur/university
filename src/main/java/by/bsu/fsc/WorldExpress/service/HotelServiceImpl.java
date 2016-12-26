package by.bsu.fsc.WorldExpress.service;

import by.bsu.fsc.WorldExpress.dao.HotelDao;
import by.bsu.fsc.WorldExpress.model.Hotel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{
    private HotelDao hotelDao;

    public void setHotelDao(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    @Override
    @Transactional
    public List<Hotel> getHotelByTourId(int id) {
        return this.hotelDao.getHotelByTourId(id);
    }
}
