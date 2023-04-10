package BlocoDeNotas;

import java.util.Scanner;

public class Main {
    static final int ADICIONARANOTACAO = 1;
    static final int BUSCARANOTACAO = 2;
    static final int FORMATARANOTACAO = 3;
    static final int APAGARANOTACAO = 4;
    static final int VIZUALIZARANOTACAO = 5;
    static final int SAIR = 6;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        boolean sairUsu = false;
        do {
            System.out.println("""
                    Digite: |1-Adicionar Anotação
                            |2-Buscar Anotação
                            |3-Formatar Anotação
                            |4-Apagar Anotação
                            |5-Vizualizar Anotações
                            |6-Sair
                    """);

            int entradaUsuario = sc.nextInt();
            sc.nextLine();

            switch (entradaUsuario) {
                case 1:
                    System.out.println("Você escolheu adicionar anotação! ");
                    System.out.println("Digite o texto:");
                    String texto = sc.nextLine();
                    Anotacao anotacaoAdicionar = new Anotacao(texto);
                    blocoDeNotas.adicionarAnot(anotacaoAdicionar);
                    break;

                case 2:
                    System.out.println("Você escolheu buscar anotação! ");
                    System.out.println("Digite o que buscar: ");
                    String textoASerBuscado = sc.nextLine();
                    blocoDeNotas.procurarPorTexto(textoASerBuscado);
                    break;

                case 3:
                    System.out.println("Você escolheu editar as anotação! ");
                    blocoDeNotas.vizualizarAnotacoes();
                    System.out.println("Digite o número da anotação que você quer editar: ");
                    int numAnotASerEditado = sc.nextInt();
                    sc.nextLine();
                    blocoDeNotas.formatar(numAnotASerEditado);
                    break;

                case 4:
                    System.out.println("Você escolheu apagar anotação!");
                    blocoDeNotas.vizualizarAnotacoes();
                    System.out.println("Digite o número da anotação que você quer apagar: ");
                    int numAnotASerApagado = sc.nextInt();
                    sc.nextLine();
                    blocoDeNotas.excluir(numAnotASerApagado);
                    break;

                case 5:
                    System.out.println("Você escolheu ver as anotações: ");
                    blocoDeNotas.vizualizarAnotacoes();
                    break;

                case 6:
                    System.out.println("Tchau! Até a próxima!");
                    sairUsu = true;
                    break;

            }
        }while (sairUsu == false);


        }

    }
