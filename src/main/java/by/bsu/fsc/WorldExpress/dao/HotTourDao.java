package by.bsu.fsc.WorldExpress.dao;


import by.bsu.fsc.WorldExpress.model.HotTour;

import java.util.List;

public interface HotTourDao {
    public HotTour getTourById(int id);
    public List<HotTour> listTours();
    public List<HotTour> sortByPrice();
    public List<HotTour> sortByPriceD();
}
