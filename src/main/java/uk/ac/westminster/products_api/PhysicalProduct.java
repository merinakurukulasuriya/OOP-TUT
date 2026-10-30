package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because Physical Product is a Product.

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    PhysicalProduct(Long id,String name, double price, double weightKg, String dimensions){
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }

    @Override
    public String getSummary(){
        return "Physical: " + getName() + " | WeightKg: " + weightKg;
    }

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        discountedPrice =  Math.min(rate,0.20);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
