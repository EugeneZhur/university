package by.bsu.fsc.WorldExpress.model;

import javax.persistence.*;

@Entity
@Table(name = "NEWS")
public class News {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "IMAGE")
    public String img;

    @Column(name = "TITLE")
    public String title;

    @Column(name = "CONTENT")
    public String cont;

    @Column(name = "DATE")
    public String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", cont='" + cont + '\'' +
                ", date=" + date +
                '}';
    }
}
