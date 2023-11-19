package animal;

public class Review04 {

    public static void main(String[] args) {

        // 各人の情報
        Animal tanaka = new Animal("田中　太郎", 25);
        tanaka.say();
        Human tanaka1 = new Human("田中　太郎", 25, "電車");
        tanaka1.think();

        Animal suzuki = new Animal("鈴木　次郎", 30);
        suzuki.say();
        Human suzuki1 = new Human("鈴木　次郎", 30, "野球");
        suzuki1.think();

        Animal sato = new Animal("佐藤　花子", 20);
        sato.say();
        Human sato1 = new Human("佐藤　花子", 20, "映画");
        sato1.think();

    }

}
