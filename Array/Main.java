public class Main {
    public static void main(String[] args) {
        // 配列宣言と、領域確保を分けて記述可能
        int[] id; // 配列宣言
        id = new int[20]; // 領域確保
        System.out.println(id); // ハッシュ値が出力
        
        // まとめて記述も可能
        int array[] = new int[4];
        System.out.println(array[0]); // 値を格納していないため0が出力
        array[0] = 200;
        System.out.println(array[0]); // 200を代入したため出力される

        // 代入までまとめて記述も可能
        int hoge[] = { 1, 2, 3, 4, 5 };
        System.out.println(hoge[1]);
        int size = hoge.length;
        System.out.println(size);

        // 二次元配列
        int[][] hello;
        hello = new int[1][1];
        hello[0][0] = 100;
        System.out.println(hello[0] + "," + hello[0][0]); // ハッシュ値と100の出力
    }
}
