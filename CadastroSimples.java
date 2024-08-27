import java.util.Scanner;

public class CadastroSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays simples para armazenar os dados
        String[] nomesUsuarios = new String[10];
        String[] enderecosUsuarios = new String[10];
        String[] nomesProdutos = new String[10];
        double[] precosProdutos = new double[10];

        int numUsuarios = 0;
        int numProdutos = 0;

        while (true) {
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Exibir Usuários");
            System.out.println("4. Exibir Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 1) {
                System.out.print("Nome do Usuário: ");
                nomesUsuarios[numUsuarios] = scanner.nextLine();
                System.out.print("Endereço do Usuário: ");
                enderecosUsuarios[numUsuarios] = scanner.nextLine();
                numUsuarios++;
            } else if (opcao == 2) {
                System.out.print("Nome do Produto: ");
                nomesProdutos[numProdutos] = scanner.nextLine();
                System.out.print("Preço do Produto: ");
                precosProdutos[numProdutos] = scanner.nextDouble();
                scanner.nextLine(); // Consumir a nova linha
                numProdutos++;
            } else if (opcao == 3) {
                System.out.println("Usuários Cadastrados:");
                for (int i = 0; i < numUsuarios; i++) {
                    System.out.println("Nome: " + nomesUsuarios[i] + ", Endereço: " + enderecosUsuarios[i]);
                }
            } else if (opcao == 4) {
                System.out.println("Produtos Cadastrados:");
                for (int i = 0; i < numProdutos; i++) {
                    System.out.println("Produto: " + nomesProdutos[i] + ", Preço: R$ " + precosProdutos[i]);
                }
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
