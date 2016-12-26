package by.bsu.fsc.WorldExpress.model;

import javax.persistence.*;

@Entity
@Table(name = "HOT_TOURS")
public class HotTour {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "LOCATION")
    public String location;

    @Column(name = "DURATION")
    public String duration;

    @Column(name = "WAY")
    public String way;

    @Column(name = "FOOD")
    public String food;

    @Column(name = "DATA")
    public String date;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        return "Горячий тур:\n" +
                "id: " + id + '\n' +
                "Локация: " + location + '\n' +
                "Дата: " + date + '\n' +
                "Продолжительность: " + duration + '\n' +
                "Точка отправления: " + way + '\n' +
                "Питание: " + food + '\n' +
                "Цена: " + price;
    }
}
