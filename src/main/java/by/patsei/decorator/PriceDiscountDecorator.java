package by.patsei.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
@Dependent
@Decorator
public class PriceDiscountDecorator implements Product {

    @Any
    @Inject
    @Delegate
    private Product product;

    @Override
    public void setLabel(String label) {

    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public String generateLabel() {
        product.setPrice(product.getPrice() * 0.5);
        product.setLabel(product.getLabel() + " (Discounted)");
        return product.generateLabel();

    }
}
