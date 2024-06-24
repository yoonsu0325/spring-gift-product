package product;

public class Product
        //(Long id, String name, Long price, String imageUrl) {
{

    Long id;
    String name;
    Long price;
    String imageUrl;

    public Product(Long id, String name, Long price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Product() {
    }
}
