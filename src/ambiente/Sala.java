package ambiente;

public class Sala {
	/**
	 * Estrutura que forma o ambiente.
	 * Armazena informacoes sobre o estado de cada sala.
	 */
	
	// estado de cada sala (limpo, sujo, obstaculo).
	public estadoSala estado;
	
	public Sala(){
		// toda sala sempre inicia limpa.
		this.estado = estadoSala.limpo;
	}
	
	public Sala(estadoSala estado){
		this.estado = estado;
	}
	
	public char getDescricaoSala(){
		switch(this.estado){
		case limpo:
			return '-';
		case sujo:
			return '*';
		case obstaculo:
			return '#';
		default:
			return ' ';
		}
	}
}
