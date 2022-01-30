import java.util.ArrayList;

public class Pizza extends MenuItems{

    private int size;
    private ArrayList <Enum> extraToppings = new ArrayList<>();



    public Pizza(int size) {
        this.setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size < 8) {
            this.size = 8;
        }
        else if(size > 16) {
            this.size = 16;
        }
        else {
            this.size = size;
        }
    }

    public void printDetails(){

    }

    private void pizzaDetails(){
        if (extraToppings.size() > 1) {
            System.out.printf("Custom Pizza %t%t(%d) %t£.2%f%n", this.size, this.getPrice());
            System.out.println(" with extra toppings:");
            for (Enum toppings: extraToppings) {
                System.out.println(" *" + toppings.toString());
            }
        }
        else {
            System.out.printf("Base Pizza %t%t(%d) %t£.2%f%n", this.size, this.getPrice());
        }

    }

    private void printToppings() {
        for (topping: a)
    }

}
