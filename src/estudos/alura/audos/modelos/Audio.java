package estudos.alura.audos.modelos;

import java.util.Scanner;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    Scanner sc = new Scanner(System.in);

    public void curte  () {
        this.curtidas++;

    }

    public void reproduz(){
        this.totalReproducoes++;
    }

    public void reproducao (){
        System.out.println("Digite a Opção: \n1Play \n2) Pause \n3 Next )");
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }



    public int getCurtidas() {
        return curtidas;
    }



    public int getClassificacao() {
        return classificacao;
    }


}
