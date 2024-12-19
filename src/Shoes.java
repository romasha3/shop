public class Shoes extends Product{
    private int size;

    public Shoes(double price, String name, int size) {
        super(price, name);
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("Shoes: "+name+",Size: "+size+",Price: "+price);
    }

}

