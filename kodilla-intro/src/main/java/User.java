public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String name() {
        return name;
    }
    public int age() {
        return age;
    }
    public static void main (String[] args) {
        User tomasz = new User("Tomasz", 28);
        User pawel = new User("Paweł", 18);
        User magda = new User("Magda", 32);
        User anna = new User("Anna", 14);

        User[] users = {tomasz, pawel, magda, anna};

        int result = 0;

        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age();
        }

        double averageAge = result / users.length;

        System.out.println("Średnia wieku to: " + averageAge);

        for (int j = 0; j < users.length; j++) {
            int age = users[j].age;

            if (age < averageAge) {
                System.out.println("Osoby poniżej średniej: " + users[j].name);
            }
        }
    }
}
