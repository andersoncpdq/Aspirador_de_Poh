package main;

import ambiente.AmbienteAspiradorReativoSimples;
import ambiente.estadoSala;

public class MainAspiradorReativoSimples {

	public static void main(String[] args) {
		
		AmbienteAspiradorReativoSimples aspiradorNoAmbiente = new AmbienteAspiradorReativoSimples(4, 4);
		
		// Adicionando sujeira e obstáculos na mao!
		// Windsom coloca tua funcao randomica pra funcionar! =P
//		aspiradorNoAmbiente.setSujeira(1, 2);
//		aspiradorNoAmbiente.setSujeira(4, 2);
//		aspiradorNoAmbiente.setSujeira(3, 3);
//		aspiradorNoAmbiente.setSujeira(2, 4);
//		
//		aspiradorNoAmbiente.setObstaculo(3, 1);
//		aspiradorNoAmbiente.setObstaculo(2, 3);
//		aspiradorNoAmbiente.setObstaculo(4, 3);

		aspiradorNoAmbiente.randomColocarSujeiras();
		aspiradorNoAmbiente.randomColocarObstaculos();
		
		System.out.println("- Ambiente antes da limpeza:");
		aspiradorNoAmbiente.exibirAmbiente();
		
		while(aspiradorNoAmbiente.existeSujeira())
			aspiradorNoAmbiente.executarAspirador();
		
		System.out.println("- Ambiente apos a limpeza: ");
		aspiradorNoAmbiente.exibirAmbiente();
		
		aspiradorNoAmbiente.exibirInfo();

	}

}
