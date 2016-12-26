package by.bsu.fsc.WorldExpress.dao;

import by.bsu.fsc.WorldExpress.model.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsDaoImpl implements NewsDao{
    private static final Logger logger = LoggerFactory.getLogger(NewsDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<News> listNews() {
        Session session = this.sessionFactory.getCurrentSession();
        List<News> newsList = session.createQuery("from News").list();

        for(News news: newsList) {
            logger.info("News: " + news);
        }

        return newsList;
    }
}
