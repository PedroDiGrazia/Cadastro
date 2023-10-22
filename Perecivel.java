import java.time.LocalDate;

public class Perecivel {
    
    private LocalDate validade;
    private Produto produto;

    public Perecivel(Produto produto, int ano, int mes, int dia) {
        this.produto = produto;
        this.validade = LocalDate.of(ano, mes, dia);
    }

    public boolean estaVencido(boolean vencido){
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.isAfter(validade);
    }

    public void aplicaDesconto(double percentualDesconto) {
        if (percentualDesconto > 0 && percentualDesconto <= 100) {
            double desconto = (percentualDesconto / 100) * produto.getValor();
            double novoValor = produto.getValor() - desconto;
            produto = new Produto(produto.getDescricao(), novoValor);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    public void impressao(){
        System.out.printf("\nID: %d"+
                          "\nDESCRIÇÃO: %s" +
                          "\nVALOR: %.2f",this.produto.getId(),this.produto.getDescricao(),this.produto.getValor());
    }
}
