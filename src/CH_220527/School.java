package CH_220527;

public class School {
    String name;
    int age;
    char gender;

    void Teacher() {
        System.out.println("선생님입니다");
    }

    void Teacher(String name) {
        System.out.println("저의 이름은 " + name + "이고,");
    }

    void Teacher(int age, char gender) {
        System.out.println(" 나이는 " + age + "살이고, 성별은 " + gender + "자 입니다.");
    }

    void getTeacher() {
        System.out.println(age);
    }
}
