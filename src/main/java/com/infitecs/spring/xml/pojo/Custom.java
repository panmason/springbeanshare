package com.infitecs.spring.xml.pojo;

/**
 * @author peter pan on 10/20/2016.
 */
public class Custom {

    private String name;

    private String order;

    private double price;

    public Custom() {
    }

    public Custom(String name, String order, double price) {
        this.name = name;
        this.order = order;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "name='" + name + '\'' +
                ", order='" + order + '\'' +
                ", price=" + price +
                '}';
    }
}
