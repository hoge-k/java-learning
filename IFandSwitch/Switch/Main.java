public class Main {
    public static void main(String[] args) {
        // switch文
        int num = 5;
        switch (num) {
            case 1: // numの値が1の時の処理
                System.out.println("numの値は1です");
                break;

            case 2: // numの値が2の時の処理
                System.out.println("numの値は2です");

            case 5: // numの値が5の時の処理
                System.out.println("numの値は5です"); // breakが無いためdeafultも実行される

            default: // numの値が1と2以外の場合に実行される
                System.out.println("default文の処理");
                break;
        }
    }
}
