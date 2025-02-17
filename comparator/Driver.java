package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {

        Student s = new Student();
        ArrayList<Student> s1 = new ArrayList<>();


        s1.add(new Student(120,"Adam","BTech"));
        s1.add(new Student(128,"Zack","BCom"));
        s1.add(new Student(132,"Gill","BArch"));
        s1.add(new Student(177,"Moin","BPharma"));
        s1.add(new Student(190,"Smith","BSC"));
        s1.add(new Student(123,"John","BCA"));
        s1.add(new Student(112,"Beckham","BVoc"));
        s1.add(new Student(161,"Paul","MCA"));
        s.setId(122);
        s.setName("Bill");
        s.setCourse("MCom");

        s1.add(s);


        System.out.println(s1);


        System.out.println("======================================================");
        Collections.sort(s1,new SortByName());

        System.out.println(s1);
        System.out.println("======================================================");

        Collections.sort(s1,new SortByCourse());
        System.out.println(s1);

    }
}
