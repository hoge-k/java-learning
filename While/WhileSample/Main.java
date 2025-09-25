// whileとdo whileの違い
public class Main {
    public static void main(String[] args) {
        // whileの場合
        int count = 5;
        while(count != 5 && count > 0) {
            System.out.println("while    : count = " + count);
            count--;
        }
        // do whileの場合
        do {
            System.out.println("do-while : count = " + count);
            count--;
        }while(count != 5 && count > 0);
    } //while文はスルー、do whileはdoブロックが実行されデクリメントで-1されるため処理が継続する
}
