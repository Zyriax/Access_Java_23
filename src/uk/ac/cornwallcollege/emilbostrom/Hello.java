package uk.ac.cornwallcollege.emilbostrom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World! " + args[0] + " " + args[1]);
        String name = "Emil Bostrom";
        int space = name.indexOf(" ");
        System.out.println(space);

        String fName = name.substring(0, 4);
        System.out.println(fName);

        String lName = name.substring(5, 12);
        System.out.println(lName);

        String rName = lName + ", " + fName;
        System.out.println(rName);

        char fInitial = name.charAt(0);
        char lInitial = name.charAt(5);

        System.out.println(fInitial + ", " + lInitial);

        List<String>mylist = new ArrayList<>();
        List<String>surnameFirst = new ArrayList<>();

        mylist.add("Emil Bostrom");
        mylist.add("Mike Algie");
        mylist.add("Sam H");
        mylist.add("James A");
        for(var s : mylist) {
            Name cur = new Name(s);
            String reversed = cur.reverseOrder();
            surnameFirst.add(reversed);
        }

        Collections.sort(surnameFirst);
        for(var s : surnameFirst) {
            System.out.println(s);
        }
    }
}
