package CH_220522;
import java.util.*;
public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student_> list = new ArrayList<Student_>();
        list.add(new Student_("javaKing", 1, 1));
        list.add(new Student_("javaJjang", 1, 2));
        list.add(new Student_("Gildong", 2, 1));

        Iterator<Student_> it = list.iterator();
        while (it.hasNext()) {
            Student_ s = it.next();
            System.out.println(s.name);
        }
    }
}

class Student_ {
    String name = "";
    int ban;
    int no;

    Student_(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
