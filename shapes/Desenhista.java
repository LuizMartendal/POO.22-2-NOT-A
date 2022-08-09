
/**
 * Escreva uma descrição da classe Desenhista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Desenhista
{
    public void desenharFigura(){   // colaboração do Felipe Zago
        Circle rosto = new Circle();
        Circle olhoEsq = new Circle();
        Circle olhoDir = new Circle();
        Triangle nariz = new Triangle();
        Square boca = new Square();
        rosto.makeVisible();
        rosto.moveHorizontal(40);
        rosto.changeSize(180);
        olhoEsq.makeVisible();
        olhoEsq.changeColor("green");
        olhoEsq.moveHorizontal(80);
        olhoEsq.moveDown();
        olhoEsq.moveDown();
        olhoDir.makeVisible();
        olhoDir.changeColor("green");
        olhoDir.moveHorizontal(150);
        olhoDir.moveDown();
        olhoDir.moveDown();
        nariz.makeVisible();
        nariz.changeColor("black");
        nariz.moveHorizontal(100);
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        boca.makeVisible();
        boca.changeColor("red");
        boca.moveHorizontal(77);
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
    }

}
