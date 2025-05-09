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

    public Navio(Grade grade, int tamanhoNavio) {
        this.grade = grade;
        this.tamanhoNavio = tamanhoNavio;
    }

    //A classe Navio deve ter um método público chamado desenhar que recebe um objeto Draw como
    //argumento.

    //O método desenhar deve usar o objeto Draw para desenhar um navio na tela.
    public void desenhar (Draw draw){
           int inicioX = grade.getX();
           int inicioY = grade.getY();


        for (int i = 0; i < tamanhoNavio; tamanhoNavio++){
            draw.filledSquare(grade.getX(), grade.getY(), 40/2.0);
            draw.setPenColor(corNavio);

        }

    }

    //O objeto Navio deve ser construído com argumentos para definir à qual Grade ele pertence, seu
    //tamanho, posição (x, y) na grade e orientação (vertical ou horizontal) (Por exemplos, o Navio da
    //Figura 2 possui tamanho 5, posição (3, 2) e orientação vertical)


    //O Navio deve ser desenhado como uma série de quadrados coloridos. A dimensão dos quadrados é
    //igual ao tamanho da célula da Grade (40 × 40 pixels). A cor dos quadrados deve ser a mesma dos
    //rótulos da Grade.
}
