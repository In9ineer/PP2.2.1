package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @Column
    private Long id;

    @Column
    String model;

    @Column
    int series;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    User user;

    public Car() { }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
