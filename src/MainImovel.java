import java.util.ArrayList;

public class MainImovel {
    public static void main(String[] args) {

        ArrayList<Imovel> listImovel = new ArrayList<Imovel>();

        listImovel.add(new ImovelNovo("Rua Dos Passaros",1500,500));
        listImovel.add(new ImovelAntigo("Rua Dos Anjos",1000,500));

        for (Imovel imovel: listImovel) {
            imovel.imprimir();
            System.out.println("Valor Final da casa Endereço "+ imovel.getEndereco() + ":" + imovel.calcularValorImovel() + "\n");
        }

        System.out.println("Imprimindo valor finais:");
        for (Imovel imovel: listImovel) {
            imovel.imprimir();
        }

        double menorPreco = listImovel.get(0).getPreco();
        String menorPrecoEnd = listImovel.get(0).getEndereco();
        for (int i = 1; i < listImovel.size(); i++){
            if (listImovel.get(i).getPreco()<menorPreco) {
                menorPreco = listImovel.get(i).getPreco();
                menorPrecoEnd = listImovel.get(i).getEndereco();
            }
        }

        System.out.println("Endereço com menor preço de imóvel: " + menorPrecoEnd);

    }
}
