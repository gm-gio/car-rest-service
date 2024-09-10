package com.java.course.Car_Rest_Service.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "models", schema = "car_rest_service")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "make_id")
    private Make make;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;

    public Model(Long id, String name, Make make, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.make = make;
        this.cars = cars;
    }

    public Model() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(id, model.id) && Objects.equals(name, model.name) && Objects.equals(make, model.make) && Objects.equals(cars, model.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, make, cars);
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", make=" + make +
                ", cars=" + cars +
                '}';
    }
}
