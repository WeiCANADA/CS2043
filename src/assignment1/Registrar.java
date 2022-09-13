package assignment1;


public class Registrar {
    private Grade grade;

    public static String setLetter(double d) {
        String s = null;
        if(d == 4.3) s ="A+";
        else if(d == 4) s ="A";
        else if(d == 3.7) s ="A-";
        else if(d == 3.3) s ="B+";
        else if(d == 3) s ="B";
        else if(d == 2.7) s ="B-";
        else if(d == 2.3) s ="C+";
        else if(d == 2) s ="C";
        else if(d == 1) s ="D";
        else if(d == 0) s ="F";

        return s;
    }

    public static double setPoint(String s){
       double d = 0.0;
        switch (s) {
            case "A+":
                d = 4.3;
                break;
            case "A":
                d = 4;
                break;
            case "A-":
                d = 3.7;
                break;
            case "B+":
                d = 3.3;
                break;
            case "B":
                d = 3;
                break;
            case "B-":
                d = 2.7;
                break;
            case "C+":
                d = 2.3;
                break;
            case "C":
                d = 2;
                break;
            case "D":
                d = 1;
                break;
            case "F":
                d = 0;
                break;
        }
        return d;

    }
}
