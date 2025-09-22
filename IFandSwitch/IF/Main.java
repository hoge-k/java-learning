public class Main {
    public static void main(String[] args) {
        // if文
        int num = 5;
        if (num > 4) {
            System.out.println("numの値は4以上");
        }

        // boolean型
        boolean b1 = false; boolean b2 = true;
        if(b1 = b2){ // b1にb2の値が代入、boolean値で返るためif文としては問題ない
            System.out.println("b1: " + b1);
            System.out.println("b2: " + b2);
        }

        // if-else文
        int numm = 30;
        if (numm < 10){
            System.out.println("nummの値は10未満");
        } else {
            System.out.println("nummの値は10以上");
        }

        // else-if文
        int nummm = 20;
        if (nummm < 10){
            System.out.println("nummmの値は10未満");
        } else if (nummm == 20){
            System.out.println("nummmの値は20");
        } else {
            System.out.println("nummmの値は10以上");
        }

        // 演算子による条件分
        String str = "numの値は";
        str += num < 20 ? "20未満" : "20以上";
        System.out.println(str);

        // if文のネスト
        if (num >= 3){
            System.out.println("numは3以上です。");
            if(num == 5){
                System.out.println("numは5です。");
            }
        }
    }
}
