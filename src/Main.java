
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Robo robo = new Robo("preto");
		System.out.println("Digite as coordenadas do Alimento");
		int c1,c2;
		robo.encontrarAlimento(c1=in.nextInt(),c2=in.nextInt());
		System.out.println("Coordenada do alimento: ("+c1+","+c2+")\n");
		System.out.println("Para mover o rob�, utilize as teclas:\n1-up\n2-down\n3-right\n4-left\nposi��o inicial do rob�: (0,0)");
		for(int i = 0; i <100; i++) {
			robo.mover(in.nextInt());
			System.out.println("Posi��o do rob�: ("+robo.getX()+","+robo.getY()+")");
			if(robo.getX() == c1&&robo.getY() == c2) {
				break;
			}
			
		}
		System.out.println("Parab�ns! Voc� encontrou o alimento");

	}

}