package hello.world;
/* パッケージはクラス単体では扱えずパッケージ名+クラス名で扱う必要がある。
 * javac hello/world/Main.javaを実行
 * java hello.world.Mainを実行
 */

class Foo {
    void print() {
        System.out.println("package sample");
    }
}
class Main {
    public static void main(String[] args) {
        Foo f = new Foo();
        f.print();
    }
}