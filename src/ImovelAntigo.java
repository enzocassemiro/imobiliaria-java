public class ImovelAntigo extends Imovel {
    private double descontaPreco;

    //Constructor
    public ImovelAntigo(String endereco, double preco, double descontaPreco) {
        super(endereco, preco);
        this.descontaPreco = descontaPreco;
    }

    //Getter and Setter
    public double getDescontaPreco() {
        return descontaPreco;
    }

    public void setDescontaPreco(double descontaPreco) {
        this.descontaPreco = descontaPreco;
    }

    //Methods
    @Override
    public double calcularValorImovel() {
        setPreco(getPreco()-descontaPreco);
        setDescontaPreco(0);
        return getPreco();
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo lista de Imóveis Antigos");
        System.out.println("Endereço:" + getEndereco());
        System.out.println("Preço:" + getPreco());
        System.out.println("Desconto:" + getDescontaPreco() + "\n");
    }
}
