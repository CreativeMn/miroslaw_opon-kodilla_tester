public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 2) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 2 && this.weight <= 3) {
            System.out.println("The notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkPriceAndYear() {
        if (this.price <= 500 && this.year <= 2010) {
            System.out.println("The notebook is very cheap and very old.");
        } else if (this.price <= 1000 && this.year <= 2018) {
            System.out.println("The notebook is cheap and old.");
        } else if (this.price <= 1500 && this.year <= 2022) {
            System.out.println("The notebook is expensive and modern");
        } else {
            System.out.println("The notebook is very expensive and very modern. ");
        }
    }
}

