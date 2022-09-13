package assignment1;

public class Grade {
    private String courseNumber;
    private String gradeLetter;
    private double gradePoint;
    private int creditHour;
    //private Registrar registrar;

   public Grade(String courseNumber, int creditHour, String gradeLetter) {
        this.courseNumber = courseNumber;
        this.gradeLetter = gradeLetter;
        this.creditHour = creditHour;
        setGradePoint(Registrar.setPoint(gradeLetter));
    }

    public Grade(String courseNumber, int creditHour, double gradePoint) {
        this.courseNumber = courseNumber;
        this.gradePoint = gradePoint;
        this.creditHour = creditHour;
        setGradeLetter(Registrar.setLetter(gradePoint));
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getGradeLetter() {
        return gradeLetter;
    }

    public void setGradeLetter(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    @Override
    public String toString() {
        return "courseNumber=" + courseNumber + " "
                + creditHour + "CH "
                + gradePoint + " "
                + "("+ gradeLetter + ")";
    }

}
