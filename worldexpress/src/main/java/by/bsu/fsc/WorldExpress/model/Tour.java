package by.bsu.fsc.WorldExpress.model;

import javax.persistence.*;

@Entity
@Table(name = "TOURS")
public class Tour {
    @Id
    @Column(name = "ID_tour")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "COUNTRY")
    public String country;

    @Column(name = "CITY")
    public String city;

    @Column(name = "TOUR_DURATION")
    public String duration;

    @Column(name = "WAY")
    public String way;

    @Column(name = "FOOD")
    public String food;

    @Column(name = "PRICE")
    public int price;

    @Column(name = "HOTEL_ID")
    public int hotel_id;

    @Column(name = "IMAGE")
    public String img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Тур:\n" +
                "id: " + id + '\n' +
                "Страна: " + country + '\n' +
                "Город: " + city + '\n' +
                "Продолжительность: " + duration + '\n' +
                "Точка отправления: " + way + '\n' +
                "Питание: " + food + '\n' +
                "Цена: " + price;
    }
}
