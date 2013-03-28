package agentes;

import ambiente.AmbienteAspiradorReativoSimples;
import sensores.SensorObstaculo;
import sensores.SensorSujeira;

/**
 * Agente Aspirador Reativo Simples baseado em regras condicao-acao.
 * Movimenta-se aleatoriamente entre as salas do ambiente. Caso uma sala
 * contenha obstaculo, o aspirador escolhe aleatoriamente outra sala ate
 * encontrar uma desocupada para que possa se movimentar e executar a possivel
 * limpeza.
 */

public class AspiradorReativoSimples extends Aspirador {

	public AspiradorReativoSimples() {
		this.deslX = 0;
		this.deslY = 0;
		// posicao inicial do aspirador.
		this.posX = 1;
		this.posY = 1;
		// instancia dos sensores.
		this.sensorSujeira = new SensorSujeira();
		this.sensorObstaculo = new SensorObstaculo();
	}

	public void direcaoAleatoria() {
		// randomiza numeros de 0 a 3.
		int nRandom = ((int) (Math.random() * 10) % 4);

		// escolhe direcao.
		switch (nRandom) {
		case 0:
			this.setDirecao(DirecaoAspirador.cima);
			break;
		case 1:
			this.setDirecao(DirecaoAspirador.baixo);
			break;
		case 2:
			this.setDirecao(DirecaoAspirador.esquerda);
			break;
		case 3:
			this.setDirecao(DirecaoAspirador.direita);
			break;
		default:
			break;
		}
	}
}
