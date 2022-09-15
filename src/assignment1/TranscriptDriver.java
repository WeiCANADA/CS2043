package assignment1;

/**
 * @author Wei Liu 3718446;
 */
public class TranscriptDriver {
    public static void main(String[] args) {
        Transcript t1 = new Transcript(8510804);
        boolean b;
       b = t1.add(new Grade("CS1003", 4,"B"));
        System.out.println(b);
        t1.add(new Grade("CS2033", 4,"A"));
        t1.add(new Grade("ECE2213", 4, 3.3));
        t1.add(new Grade("ECON1001", 3, 2.0));
        t1.add(new Grade("CS2033", 4,"B"));
        t1.printTranscript();

        Transcript t2 = new Transcript(8510805);
        t2.printTranscript();
    }
}
