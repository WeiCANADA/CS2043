package assignment1;

import java.util.Arrays;

public class Transcript {
    private int studentId;
    private Grade[] grades;
    private final int MAX = 100;
    private int gradesQTY;

    public Transcript(int studentId) {
        this.studentId = studentId;
        grades = new Grade[MAX];
        clearGrades();
    }

    public boolean add(Grade grade) {
        if (gradesQTY < MAX) {
            for (int i = 0; i <= gradesQTY; i++) {
                if (grades[gradesQTY] == null) {
                    grades[gradesQTY] = grade;
                    gradesQTY++;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student " + studentId +
                ": grades=" + Arrays.toString(grades);
    }

    public void clearGrades() {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = null;
        }
        gradesQTY = 0;
    }

    public void printTranscript() {
        System.out.println("Student " + studentId + ':' + " GPA " + calculate_GPA());
        for (int i = 0; i < gradesQTY; i++) {
            System.out.println(grades[i].toString());
        }
    }

    public int getGradesQTY(){
        return this.gradesQTY;
    }

    public Grade[] getGrades(){
        return this.grades;
    }

    public double calculate_GPA() {
        double sum = 0;
        for (int i = 0; i < getGradesQTY(); i++) {
            sum += getGrades()[i].getGradePoint() * getGrades()[i].getCreditHour();
        }
        return sum / getGradesQTY();
    }

}
