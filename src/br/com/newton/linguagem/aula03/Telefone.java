package br.com.newton.linguagem.aula03;

public class Telefone {
    Contato contato;

    // atributo marca
    public String marca;

    // atributo cor
    public String cor;


    public void Tocar(String musica){
        if (musica.equals("sertanejo")) {
            System.out.println("Só tocamos sertanejo");
        }
        System.out.println("Tocando" + musica);
    }

    public void Ligar (Telefone tel){
        if(tel.cor.equals("preto") || tel.contato.nome.equals("Juliana")){

        }
        System.out.println("Ligando" + tel);
    }

}
