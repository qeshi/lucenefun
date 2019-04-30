import java.util.Set;

class Product implements java.io.Serializable
{
    String name;
    String image;
    String[] regions;
    int numberSold;

    public Product(String name, String image, String[] regions,
                   int numberSold) {
        this.name = name;
        this.image = image;
        this.regions = regions;
        this.numberSold = numberSold;
    }
}