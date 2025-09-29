class Employee {
    int id;
    void setId(int i) {
        id =i;
    }
    int getId() {
        return id;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee yamada = new Employee(); // 山田さん用オブジェクト作成
        yamada.setId(8192); //ID 8192をセット
        Employee saho = new Employee(); // 佐保さん用オブジェクト作成
        saho.setId(65536); // ID 65536 をセット
        System.out.println("山田さん：" + yamada.getId()); // 山田さんのIDを表示
        System.out.println("佐保さん：" + saho.getId()); // 佐保さんのIDを表示
    }
}