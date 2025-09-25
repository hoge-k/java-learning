public class Main {
    /* for文
     * for(式1 ; 式2 ; 式3) {
     * 処理文;
     * }
     */
    public static void main(String[] args) {
        for(int count = 0; count < 5; count++){
            System.out.print(count + " ");
        }
        System.out.println();
        int count1 = 0;
        for(; count1 < 5; count1++ ) { // 式1の省略
            System.out.print(count1 + " ");
        }
        System.out.println();
        for(int count2 = 0; count2 < 5;) { // 式3の省略
            System.out.print(count2++ + " "); // 繰り返しの中でインクリメント
        }
        System.out.println();
        // 拡張for文
        /* for(変数宣言 : 参照変数名) {
            処理文;
        }
         */
        // 配列の宣言
        char[] array = { 'a', 'b', 'c', 'd', 'e' };
        // 配列arrayの全要素を順番に取り出し、出力する
        for(char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
        for(int count3 = 0; count3 < array.length; count3++) {
            System.out.print(array[count3] + " ");
        }
    }
}
