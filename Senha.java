import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String senhaCorreta = "1234";
        boolean acessoLiberado = false;

        while (!acessoLiberado) {
            System.out.print("Digite a senha: ");
            String senhaDigitada = entrada.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                acessoLiberado = true;
                System.out.println("Acesso liberado!");
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        entrada.close();
    }
}