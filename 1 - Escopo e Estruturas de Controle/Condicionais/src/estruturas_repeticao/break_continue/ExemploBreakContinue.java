package estruturas_repeticao.break_continue;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if(i == 3)
                continue;;
        }
    }
}
