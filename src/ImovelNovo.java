public class ImovelNovo extends Imovel {
    private double adicionalPreco;

    //Constructor
    public ImovelNovo(String endereco, double preco, double adicionalPreco) {
        super(endereco, preco);
        this.adicionalPreco = adicionalPreco;
    }

    //Getter and Setter
    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    //Methods
    @Override
    public double calcularValorImovel() {
        setPreco(getPreco()+adicionalPreco);
        setAdicionalPreco(0);
        return getPreco();
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo lista de Imóveis Novos");
        System.out.println("Endereço:" + getEndereco());
        System.out.println("Preço:" + getPreco());
        System.out.println("Preço Adicional:" + getAdicionalPreco() + "\n");
    }
}
