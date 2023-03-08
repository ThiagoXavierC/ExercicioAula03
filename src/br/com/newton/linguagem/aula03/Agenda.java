package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main (String[] args){

        //Criando um obj telefone utilizando um construtor sem parâmetro padrão
        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        contato.nome = "Rafaela";
        contato.numero = "25524343";

        telefone.contato = contato;

        Contato cont1 = new Contato();
        cont1.nome = "joao";
        cont1.numero = "318989952";

        Telefone tel1 = new Telefone();
        tel1.marca = "Iphone";
        tel1.cor = "branco";
        tel1.contato = cont1;

        Contato cont2 = new Contato();
        cont2.nome = "Carmen";
        cont2.numero = "3189871147";

        Telefone tel2 = new Telefone();
        tel2.marca = "S20";
        tel2.cor = "preto";
        tel2.contato = cont2;

        telefone.Tocar("Sertanejo");
        tel1.Tocar("Funk");
        tel2.Tocar("Rap");

        System.out.println(telefone.contato.nome);
    }
}
