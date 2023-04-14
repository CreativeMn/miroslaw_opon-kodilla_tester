public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println(notebook.year + "   " + notebook.price);
        notebook.checkPriceAndYear();
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(heavyNotebook.year + "   " + heavyNotebook.price);
        heavyNotebook.checkPriceAndYear();
        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(oldNotebook.year + "   " + oldNotebook.price);
        oldNotebook.checkPriceAndYear();
    }
}
