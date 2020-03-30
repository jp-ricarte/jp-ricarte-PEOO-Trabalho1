
public class Robo {
	private String cor;
	private int x;
	private int y;
	
	public Robo(String cor) {
		this.cor=cor;
		this.x = 0;
		this.y = 0;

	}
	
	 public String getCor(){
	        return this.cor;
	    }
	 
	 public int getX(){
	        return this.x;
	    }
	 
	 public int getY(){
	        return this.y;
	    }
	 
	 public void setCor(String cor) {
			this.cor = cor;
		}
	 public void setX(int x) {
			this.x = x;
		}
	 public void setY(int y) {
			this.y = y;
		}
	 public void mover(String movimento) {

			try {

				if(movimento == "up") {
					y++;
				}

				else if(movimento == "down") {
					if(y==0) {
						throw new MovimentoInvalidoException(x,y);
					}if(y>0) {
						y--;
					}
				}

				else if(movimento=="right") {
					x++;
				}

				else if(movimento=="left") {
					if(x==0) {
						throw new MovimentoInvalidoException(x,y);
					}if(x>0) {
						x--;
					}
				}

			}catch(MovimentoInvalidoException erro) {
				System.out.println("Movimento inválido: Coordenada negativa.");


			}
			System.out.println("O robo está na posição ("+x+","+y+")");
		}
	 
	 public void mover(int opcao) {
			
			try {
				if(opcao==1) {
					y++;
				}

				if(opcao==2) {
					if(y==0) {
						throw new MovimentoInvalidoException(x,y);
					}
				}

				if(opcao==3) {
					x++;
				}

				if(opcao==4) {
					if(x==0) {
						throw new MovimentoInvalidoException(x,y);
					}
				}
				
			}catch(MovimentoInvalidoException erro) {
				System.out.println("Não pode ter coordenadas negativas!");
			}
		}
		
		public boolean encontrarAlimento(int x, int y) {
			
			boolean encontrarAlimento = false;
			
			if(this.x == x && this.y == y) {
				encontrarAlimento=true;
				return encontrarAlimento;
				
			}else {
				return encontrarAlimento;
			}
			
		}
}
