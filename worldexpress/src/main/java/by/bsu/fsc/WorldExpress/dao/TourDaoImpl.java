package by.bsu.fsc.WorldExpress.dao;

import by.bsu.fsc.WorldExpress.model.Tour;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourDaoImpl implements TourDao{
    private static final Logger logger = LoggerFactory.getLogger(TourDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Tour getTourById(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Tour tour = (Tour) session.load(Tour.class, new Integer(id));
        logger.info("Tour successfully loaded. Tour details: " + tour);

        return tour;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tour> listTours() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Tour> tourList = session.createQuery("from Tour").list();

        for(Tour tour: tourList) {
            logger.info("Tours: " + tour);
        }

        return tourList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tour> filterByCountry(String country) {
        Session session = this.sessionFactory.getCurrentSession();

        List<Tour> tourList = session.createQuery("FROM Tour T WHERE T.country='" + country + "'").list();

        return tourList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tour> sortByPrice() {
        Session session = this.sessionFactory.getCurrentSession();

        List<Tour> tourList = session.createQuery("from Tour T order by T.price asc").list();

        return tourList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tour> sortByPriceD() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Tour> tourList = session.createQuery("from Tour T order by T.price desc").list();

        return tourList;
    }
}
