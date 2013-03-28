package main;

import ambiente.AmbienteAspiradorReativoSimples;

public class MainAspiradorReativoSimples {

	public static void main(String[] args) {
		
		AmbienteAspiradorReativoSimples aspiradorNoAmbiente = new AmbienteAspiradorReativoSimples(4, 4);

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
