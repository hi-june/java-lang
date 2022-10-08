package animal;

public class Dog {
    public static void main(String[] args) {
        zoo.Cat cat = new zoo.Cat();
        welcome(cat);
    }

    public static void welcome(zoo.Cat cat){
        cat.makeSound();    // 호출 가능! 컴파일 성공!
        // cat.makeHappy(); // 호출 불가! 컴파일 오류!
    }
}
