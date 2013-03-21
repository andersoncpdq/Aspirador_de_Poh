package ambiente;

public class Main {
	
	static Ambiente E = new Ambiente(4, 4);
	static int altura = E.getAltura();
	static int largura = E.getLargura();
	static Sala matriz[][] = E.getAmbiente();
	
	public static void main(String[] args) {
		
		E.setSujeira(2, 2);
		E.setSujeira(3, 4);
		E.setObstaculo(2, 3);
		E.setObstaculo(4, 3);
		
		System.out.println();
		for (int x = 0; x < altura; x++) {
			for (int y = 0; y < largura; y++) {
				System.out.print(matriz[x][y].getDescricaoSala() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
