package ambiente;

public class Ambiente {

	/**
	 * Ambiente onde o Aspirador de Poh ira agir.
	 * Eh constituido por uma matriz quadrada (largura x altura) de salas.
	 */
	
	protected int largura;
	protected int altura;
	protected Sala[][] ambiente;
	
	public Ambiente(int largura, int altura){
		// verificacao de ambiente n x n e sua instanciacao.
		if(largura == altura){
			this.largura = largura + 2;
			this.altura = altura + 2;
			this.ambiente = new Sala[this.largura][this.altura];
		} else {
			System.out.println("O ambiente deve ser quadrado!");
		}
		
		// formando o ambiente.
		for (int l = 0; l < this.largura; l++) {
			for (int h = 0; h < this.altura; h++) {
				if( ehParede(l, h, this.largura, this.altura) )
					ambiente[l][h] = new Sala(estadoSala.obstaculo);
				else
					ambiente[l][h] = new Sala();
			}
		}
	}
	
	// Retorna verdadeiro caso a posicao seja uma parede (obstaculo).
	public boolean ehParede(int l, int h, int largura, int altura){
		boolean flag = false;
		if( l == 0 || h == 0 || l == (largura - 1) || h == (altura - 1) )
			flag = true;
		return flag;
	}
	
	// Retorna verdadeiro caso a posicao nao tenha obstaculos.
	public boolean posicaoValida(int l, int h){
		boolean flag = false;
		if( (l > 0 && l < this.largura) && (h > 0 && h < this.largura) 
			&& (this.ambiente[l][h].estado != estadoSala.obstaculo) )
			flag = true;
		return flag;
	}
	
	// Deposita sujeita nas coordenadas passadas por parametro.
	public void setSujeira(int l, int h){
		if( posicaoValida(l, h) )
			this.ambiente[l][h].estado = estadoSala.sujo;
	}
	
	// Constroe um obstaculo nas coordenadas passadas por parametro.
	public void setObstaculo(int l, int h){
		if( posicaoValida(l, h) )
			this.ambiente[l][h].estado = estadoSala.obstaculo;
	}

	public int getLargura() {
		return this.largura;
	}
	
	public int getAltura() {
		return this.altura;
	}

	public Sala[][] getAmbiente() {
		return this.ambiente;
	}
}
