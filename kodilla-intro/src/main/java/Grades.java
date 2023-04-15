public class Grades {
    public int[] grades;
    public int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        add(5);
        add(3);
        add(2);
        add(1);
        add(4);
        add(3);
        add(5);
        add(6);
        add(4);
        add(3);
        int last = lastGrade(this.grades);
        double average = gradesAverage(this.grades);

    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade(int[] grades){
        int lastGrade = grades[this.size];
        return lastGrade;
    }
    public double gradesAverage (int[] grades) {
        int sum = 0;
        double average;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        average = sum / grades.length;
        return average;
    }
}