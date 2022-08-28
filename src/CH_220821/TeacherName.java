package CH_220821;

class School {

    void Student() {	// 메소드 1
        System.out.println("선생님입니다");
    }

    String Student(String name) {		// 메소드 2. 매개변수를 다르게 만들었다.
        return name;
    }

    int Student(int age) {		// 메소드 3. 역시나 매개변수를 다르게 만들었다.
        return age;
    }
}

public class TeacherName {
    public static void main(String[] args) {
        School CH = new School();
        CH.Student();
        CH.Student("송채은");
        CH.Student(19);
        System.out.println("이름은 " + CH.Student("송채은") + " 입니다");
        System.out.println("나이는 " + CH.Student(19) + "살 입니다");
    }
}