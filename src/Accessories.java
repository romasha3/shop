public class Accessories extends Product {
    private String material;

    public Accessories(double price, String name,String material) {
        super(price, name);
        this.material=material;
    }

    @Override
    public void showInfo() {
        System.out.println("Accessories: " +name+",Material: " + material + ", Price: " + price);
    }
}
