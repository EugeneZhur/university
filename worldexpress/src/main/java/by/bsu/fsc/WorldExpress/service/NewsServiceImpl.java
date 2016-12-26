package by.bsu.fsc.WorldExpress.service;

import by.bsu.fsc.WorldExpress.dao.NewsDao;
import by.bsu.fsc.WorldExpress.model.News;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{
    private NewsDao newsDao;

    public void setNewsDao(NewsDao newsDao) {
        this.newsDao = newsDao;
    }

    @Override
    @Transactional
    public List<News> listNews() {
        return this.newsDao.listNews();
    }
}
