package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
public class Grade {
    // posições do x e do y do canto inferior esquerdo e direito respectivamente.
    private final int x;
    private final int y;
    private final int tamanhoCelula = 40; // tamanho de cada célula da grade

    public Grade(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar (Draw draw) {

        // dois for para desenhar a grade de 10x10
        for (int i = 0; i <= 10; i++) {
            int yLinha = x + i * tamanhoCelula;
            draw.line(x, yLinha, x+10 *tamanhoCelula, yLinha);
        }

        for(int j = 0; j <=10;j++){
            int xColuna = x + j * tamanhoCelula;
            draw.line(xColuna, y, xColuna, y+10*tamanhoCelula);
        }

        // rotulos do grafico

        // rotulo das colunas (os numeros de 0 a 9)
        draw.setPenColor(Draw.RED);
        for (int j =0; j < 10 ; j++){
            double xCentro = x + j * tamanhoCelula + tamanhoCelula / 2.0;
            draw.text(xCentro, y-10, String.valueOf(j));
        }

        // rotulo das linhas ( letras de A - J)

        for (int i = 0; i < 10; i++){
            double yCentro = y + i * tamanhoCelula + tamanhoCelula / 2.0;
            char letra = (char) ('A' + i);
            draw.text(x-10,yCentro,String.valueOf(letra));
        }

    }

}
