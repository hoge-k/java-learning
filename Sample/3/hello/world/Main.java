package hello.world;
import hello.world.sample.Foo; // 異なるパッケージのクラスはimport文でimport可能

public class Main {
    public static void main(String[] args) {
        Foo f = new Foo();
        f.print();
    }
}