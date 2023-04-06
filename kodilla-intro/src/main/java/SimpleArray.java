public class SimpleArray {
    public static void main(String[] args) {
        String[] otherThings = new String[6];
        otherThings[0] = "Audi";
        otherThings[1] = "Mercedes";
        otherThings[2] = "BMW";
        otherThings[3] = "Jaguar";
        otherThings[4] = "Porsche";
        otherThings[5] = "Bugatti";
        String things = otherThings[3];
        System.out.println(things);
        int numberOfElements = otherThings.length;
        System.out.println("Moja tablica zawiera: "+ otherThings.length + " " + "elementów.");

    }
}