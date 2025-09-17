public class literal {
    public static void main(String[] args) {
        int a = 267; // 10進数
        int b = 0413; // 8進数
        int c = 0x10B; // 16進数 
        int d = 0b100001011; // 2進数
        int e = 0827; // 8進数リテラルのコンパイルエラーが発生
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
