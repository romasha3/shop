public abstract class Product {
    public String name;
    public double price;

    public Product(double price,String name){
        this.price=price;
        this.name=name;

    }
    public abstract void showInfo();
}
