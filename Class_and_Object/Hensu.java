public class Hensu {
    int a; // メンバ変数
    public void method() {
        // int b; // ローカル変数
        int b = 10; // 初期化してあげることでエラー解消
        System.out.println(a);
        System.out.println(b); // 初期化しないとコンパイルエラー
    }

    public static void main(String[] args) {
        Hensu h = new Hensu();
        h.method();
    }
}
