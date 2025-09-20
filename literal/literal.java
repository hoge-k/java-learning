public class literal {
    public static void main(String[] args) {
        int a = 267; // 10進数
        int b = 0413; // 8進数
        int c = 0x10B; // 16進数 
        int d = 0b100001011; // 2進数
        //int e = 0827; // 8進数リテラルのコンパイルエラーが発生
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //System.out.println(e);
        System.out.println(3.14); // 浮動小数点
        System.out.println(3e4); // 指数
        System.out.println('A'); // 1文字
        System.out.println('\u00ff'); // Unicode
        System.out.println("Hello"); // 文字列
        System.out.println(true); // 論理値
        System.out.println(10_000);

        // データ型
        byte f = 10; short g = 20; int h = 30;
        long i = 40L; float j = 1.15F; double k = 5.67;
        char l = 'A'; boolean m = false;
        System.out.println("byte    : " + f );
        System.out.println("short   : " + g);
        System.out.println("int     : " + h);
        System.out.println("long    : " + i);
        System.out.println("float   : " + j);
        System.out.println("double  : " + k);
        System.out.println("char    : " + l);
        System.out.println("boolean : " + m);
        }
}
