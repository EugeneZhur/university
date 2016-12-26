package by.bsu.fsc.WorldExpress.model;

import javax.persistence.*;

@Entity
@Table(name = "HOTELS")
public class Hotel {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "HOTEL_NAME")
    public String name;

    @Column(name = "HOTEL_DESCR")
    public String descr;

    @Column(name = "LOCATION")
    public String location;

    @Column(name = "FOOD")
    public String food;

    @Column(name = "ROOMS")
    public String rooms;

    @Column(name = "ROOMS_DESCR")
    public String r_descr;

    @Column(name = "ENTERT")
    public String ent;

    @Column(name = "FOR_CHILD")
    public String for_child;

    @Column(name = "INFR")
    public String infr;

    @Column(name = "BEACH")
    public String beach;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getR_descr() {
        return r_descr;
    }

    public void setR_descr(String r_descr) {
        this.r_descr = r_descr;
    }

    public String getEnt() {
        return ent;
    }

    public void setEnt(String ent) {
        this.ent = ent;
    }

    public String getFor_child() {
        return for_child;
    }

    public void setFor_child(String for_child) {
        this.for_child = for_child;
    }

    public String getInfr() {
        return infr;
    }

    public void setInfr(String infr) {
        this.infr = infr;
    }

    public String getBeach() {
        return beach;
    }

    public void setBeach(String beach) {
        this.beach = beach;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                ", location='" + location + '\'' +
                ", food='" + food + '\'' +
                ", rooms='" + rooms + '\'' +
                ", r_descr='" + r_descr + '\'' +
                ", ent='" + ent + '\'' +
                ", for_child='" + for_child + '\'' +
                ", infr='" + infr + '\'' +
                ", beach='" + beach + '\'' +
                '}';
    }
}
