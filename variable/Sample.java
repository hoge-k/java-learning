public class Sample {
    private var value;
    public Sample(var value) { // varによる型推論はローカル変数の宣言時のみ可能なためコンパイルエラーが発生
        this.value = value;
    }
    public void test() {
        System.out.println(value);
    }
}
