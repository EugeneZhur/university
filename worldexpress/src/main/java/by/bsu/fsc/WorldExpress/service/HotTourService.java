package by.bsu.fsc.WorldExpress.service;

import by.bsu.fsc.WorldExpress.model.HotTour;

import java.util.List;

public interface HotTourService {
    public HotTour getTourById(int id);
    public List<HotTour> listTours();
    public List<HotTour> sortByPrice();
    public List<HotTour> sortByPriceD();
}
