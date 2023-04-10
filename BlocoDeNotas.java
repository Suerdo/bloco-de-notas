package BlocoDeNotas;

import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<Anotacao> anotacaos = new ArrayList <>();
    public void adicionarAnot(Anotacao anotacaoAdicionar){
        anotacaos.add(anotacaoAdicionar);
        anotacaoAdicionar.setNum(anotacaos.indexOf(anotacaoAdicionar));
    }
    public void formatar(int num){
        Anotacao anotacaoParaAdicionar = anotacaos.get(num);
        anotacaoParaAdicionar.formatar();
    }
    public void vizualizarAnotacoes(){
        for(int i = 0;i<anotacaos.size(); i++){

            Anotacao anotacaoParaBuscar = anotacaos.get(i);
            if(!anotacaoParaBuscar.getExcluir())
            System.out.println(anotacaoParaBuscar.getNum() + " " + anotacaoParaBuscar.getTextos() + " " + anotacaoParaBuscar.getData());

        }
    }
    public void excluir(int num){
        Anotacao anotacaoApagar = anotacaos.get(num);
        anotacaoApagar.excluir();
    }
    public void procurarPorTexto(String palavraBuscada){
        for(int i = 0; i <anotacaos.size(); i++){

            Anotacao anotacaoParaBuscar = anotacaos.get(i);

            if(anotacaoParaBuscar.getTextos().contains(palavraBuscada) && !anotacaoParaBuscar.getExcluir()){
                System.out.println(anotacaoParaBuscar.getNum() + " " + anotacaoParaBuscar.getTextos() + " " + anotacaoParaBuscar.getData());
            }
        }
    }
}

