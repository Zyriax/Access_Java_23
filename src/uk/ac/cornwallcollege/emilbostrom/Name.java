package uk.ac.cornwallcollege.emilbostrom;

public class Name {
    String first;
    String last;
    String FI;
    String LI;

    /** Constuctor */
    public Name(String s) {
        int pos = s.indexOf(" ");
        first = s.substring(0,pos);
        last = s.substring(pos+1);

    }

    public String reverseOrder() {
        return last + ", " + first;
    }

    @Override
    public String toString() {
        return first + ", " + last;
    }


}

