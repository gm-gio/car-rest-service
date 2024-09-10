package com.java.course.Car_Rest_Service.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "cars", schema = "car_rest_service")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;

    @Column(name = "car_year")
    private Long year;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToMany
    @JoinTable(
            name = "cars_categories",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    public Car(Long id, Long year, Model model, List<Category> categories) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.categories = categories;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(id, car.id) && Objects.equals(year, car.year) && Objects.equals(model, car.model) && Objects.equals(categories, car.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, model, categories);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", year=" + year +
                ", model=" + model +
                ", categories=" + categories +
                '}';
    }
}
