import java.util.Scanner;

public class tipos {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno");
        float nota = teclado.nextFloat();
        System.out.format("a nota de %s é %.1f \n", nome , nota);
    }
}
