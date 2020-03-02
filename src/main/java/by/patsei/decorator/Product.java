package by.patsei.decorator;

public interface Product {
    void setLabel(String label);
    void setPrice(double price);
    String getLabel();
    double getPrice();
    String generateLabel();
    }
