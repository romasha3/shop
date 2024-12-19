public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(double price, String name,String size,String material) {
        super(price, name);
        this.size = size;
        this.material=material;
    }
    @Override
    public void showInfo() {
        System.out.println("Clothing: "+name+",Size: "+size+",Material: "+material+",Price: "+price);
    }
}
