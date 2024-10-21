package ssafy.classpractice;

// 클래스 생성: class 키워드 이용
class Person {
    String name;
    int age;
    String hobby;

    void info() {
        System.out.println("이름은 "+name+"이고, 나이는 "+age+"입니다.");
        System.out.println("취미는 "+hobby+"입니다.");
    }

    void study(int time) {
        System.out.println(time+"시간동안 공부합니다.");
    }
}

public class PersonPractice1 {

    public static void main(String[] args) {
        Person yang = new Person();
        yang.name = "Yang";
        yang.age = 45;
        yang.hobby = "Youtube";

        Person hong = new Person();
        hong.name = "Hong";
        hong.age = 25;
        hong.hobby = "Golf";

        System.out.println(hong.age);

        hong.info();
        hong.study(2);
    }
}
