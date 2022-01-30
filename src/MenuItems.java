public class MenuItems implements IDetail {

    private String name;
    private double price;

    public MenuItems() {

    }

    public MenuItems(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    @Override
    public void printDetails() {
        System.out.println(this.name + ": " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.startsWith(" ") || !name.matches("/[^a-z]+/g")) {
            this.name = "INVALID NAME";
        }
        else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price = 0;
        }
        else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
