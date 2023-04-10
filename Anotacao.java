package BlocoDeNotas;

import java.util.Date;
import java.util.Scanner;

public class Anotacao {
        private int num;
        private String textos;
        private boolean excluir;
        private Date data;
        public static Scanner sc = new Scanner(System.in);

        public Anotacao(String textosDigitados){
            textos = textosDigitados;
            excluir = false;
            data = new Date();
        }
        public void formatar () {
            System.out.println("O texto a ser digitado é esse: ");
            System.out.println(textos);
            System.out.println("Digite o texto a ser editado: ");
            textos = sc.nextLine();
        }
        public void excluir(){
            excluir = true;
        }
        public Date getData(){
            return data;
        }
        public int getNum(){
            return num;
        }
        public String getTextos(){
            return textos;
        }
        public void setNum(int numDaAnotacao){
            num = numDaAnotacao;
        }
        public boolean getExcluir(){
            return excluir;
        }

    }

