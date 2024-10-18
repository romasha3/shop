public class Cosmetics extends Product{
    private int expiryDate;
    private String ingredients;

    public Cosmetics(double price, String name, int expiryDate,String ingredients) {
        super(price, name);
        this.ingredients = ingredients;
        this.expiryDate = expiryDate;
    }

    @Override
    public void showInfo() {
        System.out.println("Cosmetics: "+name+",Price: "+price+", Expiration year: "+expiryDate+", Ingridients: "+ingredients);
    }
}
