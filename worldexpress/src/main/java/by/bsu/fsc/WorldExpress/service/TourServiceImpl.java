package by.bsu.fsc.WorldExpress.service;

import by.bsu.fsc.WorldExpress.dao.TourDao;
import by.bsu.fsc.WorldExpress.model.Tour;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TourServiceImpl implements TourService{
    private TourDao tourDao;

    public void setTourDao(TourDao tourDao) {
        this.tourDao = tourDao;
    }

    @Override
    @Transactional
    public Tour getTourById(int id) {
        return this.tourDao.getTourById(id);
    }

    @Override
    @Transactional
    public List<Tour> listTours() {
        return this.tourDao.listTours();
    }

    @Override
    @Transactional
    public List<Tour> filterByCountry(String c) {
        return this.tourDao.filterByCountry(c);
    }

    @Override
    @Transactional
    public List<Tour> sortByPrice() {
        return this.tourDao.sortByPrice();
    }

    @Override
    @Transactional
    public List<Tour> sortByPriceD() {
        return this.tourDao.sortByPriceD();
    }
}
