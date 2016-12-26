package by.bsu.fsc.WorldExpress.dao;

import by.bsu.fsc.WorldExpress.model.Tour;

import java.util.List;

public interface TourDao {
    public Tour getTourById(int id);
    public List<Tour> listTours();
    public List<Tour> filterByCountry(String c);
    public List<Tour> sortByPrice();
    public List<Tour> sortByPriceD();
}
