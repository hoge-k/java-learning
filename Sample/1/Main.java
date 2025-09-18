public class Main {
    public static void main(String[] args) {
        int result = 0;
        long start = System.currentTimeMillis(); // 処理の測定メソッド
        for(int i = 0; i < 1000000000; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " ms");
    }
}