package by.bsu.fsc.WorldExpress.service;

import by.bsu.fsc.WorldExpress.dao.HotTourDao;
import by.bsu.fsc.WorldExpress.model.HotTour;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HotTourServiceImpl implements HotTourService{
    private HotTourDao hotTourDao;

    public void setHotTourDao(HotTourDao hotTourDao) {
        this.hotTourDao = hotTourDao;
    }

    @Override
    @Transactional
    public HotTour getTourById(int id) {
        return this.hotTourDao.getTourById(id);
    }

    @Override
    @Transactional
    public List<HotTour> listTours() {
        return this.hotTourDao.listTours();
    }

    @Override
    @Transactional
    public List<HotTour> sortByPrice() {
        return this.hotTourDao.sortByPrice();
    }

    @Override
    @Transactional
    public List<HotTour> sortByPriceD() {
        return this.hotTourDao.sortByPriceD();
    }
}
