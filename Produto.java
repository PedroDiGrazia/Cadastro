 /**
 * Produto
 */
public class Produto {
    private String descricao;
    private static int quantidade = 0;
    private int id;
    private double valor;

    Produto(String descricao, double valor){
        this.id = ++quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }    

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }

    public void impressao(){
        System.out.printf("\nID: %d"+
                          "\nDESCRIÇÃO: %s"+
                          "\nVALOR: %.2f\n\n",this.id, this.descricao,this.valor);          
    }
}
