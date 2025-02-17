package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {

        ArrayList <Employe> a1 = new ArrayList<>();
        a1.add(new Employe(101,"Jack","HCL"));
        a1.add(new Employe(108,"Rock","DXC"));
        a1.add(new Employe(102,"Tim","HPE"));
        a1.add(new Employe(145,"Aron","TCS"));
        a1.add(new Employe(108,"Finn","DELL"));


        System.out.println(a1);

        System.out.println("==============================================");
        Collections.sort(a1);
        System.out.println(a1);
    }
}
