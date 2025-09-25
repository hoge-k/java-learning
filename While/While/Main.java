public class Main {
    public static void main(String[] args) {
        int num = 0;
        // while文
        /* 書式
         * while(条件式){
         * 処理文；　条件がtrueの場合に処理文が実行される
         * }
         */
        while(num < 5){ // numの値が5未満の間繰り返す
            System.out.println(num + " ");
            num++; // numの値に1を加算
        }

        // do while文
        /*
         * do{
         *   処理文;
         * }while( 条件式 );
         */
        int yamada = 5;
        do{
            System.out.println(yamada + "-yamada-house");
            yamada++;
        }while(yamada < 10);
    }
}
