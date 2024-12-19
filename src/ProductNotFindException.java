public class ProductException extends Exception{
    private String productName;

    public String getName(){
        return "Продукт "+productName+"немає в  списку";
    }


    }

}
