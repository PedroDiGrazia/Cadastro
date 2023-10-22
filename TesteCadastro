import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        String description;
        double product_value;
        int opção,i=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\n[1] Criar produto\n");
            System.out.print("[2] Criar produto perecivel\n");
            System.out.print("[3] Encerrar\n");
            System.out.print("--> Digite aqui a sua opção: "); 
            opção = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            switch (opção) {
                case 1:
                    System.out.print("\n\t--CADASTRO DE PRODUTOS--\n\n");
                    System.out.print("\nDigite a descrição do produto: ");
                    description = scanner.next();

                    System.out.print("\nDigite o valor do produto: ");
                    product_value = scanner.nextDouble();

                    Produto produto = new Produto(description, product_value);
                    i=i+1;
                    produto.impressao();
                    
                    break;
                case 2:
                    System.out.print("\n\t--CADASTRO DE PRODUTOS PERECIVEIS--\n\n");
                    System.out.print("\nDigite a descrição do produto: ");
                    description = scanner.next();

                    System.out.print("\nDigite o valor do produto: ");
                    product_value = scanner.nextDouble();

                    Produto produto_perecivel = new Produto(description, product_value);
                    System.out.print("\nDigite o dia da validade: ");
                    int dia_validade = scanner.nextInt();

                    System.out.print("\nDigite o mês da validade: ");
                    int mes_validade = scanner.nextInt();

                    System.out.print("\nDigite o ano da validade: ");
                    int ano_validade = scanner.nextInt();

                    Perecivel perecivel = new Perecivel(produto_perecivel, ano_validade, mes_validade, dia_validade);
                    if (perecivel.estaVencido(false)) {
                        System.out.print("\nO PRODUTO EXPIROU A DATA DE VALIDADE!\n\n");
                    }
                    else{
                        System.out.print("\nO PRODUTO ESTA BOM PARA O CONSUMO!\n\n");
                    }
                    perecivel.aplicaDesconto(15);
                    perecivel.impressao();
        
                    break;
                default:
                    System.out.print("\n\nPROGRAMA ENCERRADO COM SUCESSO!\n\n");
                    break;
            }
        } while (opção != 3);
        
        scanner.close();
    }
}
