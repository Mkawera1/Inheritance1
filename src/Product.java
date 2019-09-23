public class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0.0;
        count++;
    }
// Get and set accessors for the code, description, and price instance variables


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code:                " + getCode() + "\n" +
                "Description:        " + getDescription() + "\n" +
                "Price:              " + getPrice() + "\n";
    }


    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
