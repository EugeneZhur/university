package by.bsu.fsc.WorldExpress.dao;

import by.bsu.fsc.WorldExpress.model.Hotel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelDaoImpl implements HotelDao{
    private static final Logger logger = LoggerFactory.getLogger(HotelDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Hotel> getHotelByTourId(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        String query = "SELECT hotels.* FROM hotels INNER JOIN tours on tours.HOTEL_ID = hotels.ID WHERE tours.ID_tour = " + id;

        List<Hotel> hotelList = session.createSQLQuery(query).addEntity(Hotel.class).list();

        for(Hotel hotel: hotelList) {
            logger.info("Hotels: " + hotel);
        }
        return hotelList;
    }
}
