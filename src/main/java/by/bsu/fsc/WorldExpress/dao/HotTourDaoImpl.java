package by.bsu.fsc.WorldExpress.dao;

import by.bsu.fsc.WorldExpress.model.HotTour;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotTourDaoImpl implements HotTourDao {
    private static final Logger logger = LoggerFactory.getLogger(TourDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public HotTour getTourById(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        HotTour tour = (HotTour) session.load(HotTour.class, new Integer(id));
        logger.info("Tour successfully loaded. Tour details: " + tour);

        return tour;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<HotTour> listTours() {
        Session session = this.sessionFactory.getCurrentSession();
        List<HotTour> tourList = session.createQuery("from HotTour").list();

        for(HotTour tour: tourList) {
            logger.info("Tours: " + tour);
        }

        return tourList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<HotTour> sortByPrice() {
        Session session = this.sessionFactory.getCurrentSession();

        List<HotTour> tourList = session.createQuery("from HotTour T order by T.price desc").list();

        return tourList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<HotTour> sortByPriceD() {
        Session session = this.sessionFactory.getCurrentSession();

        List<HotTour> tourList = session.createQuery("from HotTour T order by T.price asc").list();

        return tourList;
    }
}
