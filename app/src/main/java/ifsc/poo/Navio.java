package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {
    private final Grade grade;
    private int linha;
    private int coluna;
    private int tamanhoNavio;
    private boolean vertical;
    Color corNavio = Color.RED;

    //Construtor
    public Navio(Grade grade, int linha, int coluna, int tamanhoNavio, boolean vertical, Color corNavio) {
        this.grade = grade;
        this.linha = linha;
        this.coluna = coluna;
        this.tamanhoNavio = tamanhoNavio;
        this.vertical = vertical;
        this.corNavio = corNavio;
    }

    // Métdo desenhar utilizando draw para desenhar o navio 
    public void desenhar(Draw draw) {
        int inicioX = grade.getX();
        int inicioY = grade.getY();
        int tamanhoCelula = grade.getTamanhoCelula();

        // Desenhando o navio na grade levando em conta a orientação solicitada no app
        for (int i = 0; i < tamanhoNavio; i++) {
            int linhaAtual;
            int colunaAtual;

            //relação da lógica de posição do navio com a grade
            if(vertical){
                linhaAtual = linha;
                colunaAtual = coluna + i;
            } else {
                linhaAtual = linha + i;
                colunaAtual = coluna;
            }

            //lógica para desenhar o navio
            int x = inicioX + tamanhoCelula * linhaAtual; 
            int y = inicioY + tamanhoCelula *  colunaAtual;
            double xCentro = x + tamanhoCelula / 2.0; 
            double yCentro = y + tamanhoCelula / 2.0;
            draw.setPenColor(corNavio);
            draw.filledSquare(xCentro, yCentro, tamanhoCelula/2.0);
        }

    }

}
