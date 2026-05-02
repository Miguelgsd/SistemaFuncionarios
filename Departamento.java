public class Departamento {
	private String nomeDepartamento;
	private Funcionario[] arrayFunc;
	private int i;

	public Departamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
		this.arrayFunc = new Funcionario[5];
		this.i = 0;
	}

	public void adicionarFuncionario(Funcionario f) {
		if (i < arrayFunc.length) {
			arrayFunc[i] = f;
			i += 1;
		} else {
			System.out.println("Departamento lotado. Não é possível adicionar mais funcionários.");
		}
	}

	public void listarFuncionarios(){
		System.out.println("Informações dos funcionários: \n----------------------------\n");
		for (int j = 0; j < i; j++) {
			if (arrayFunc[j] != null) {
				arrayFunc[j].exibirDados();
			}
			System.out.println("\n-----------------------");
		}

	}

	public double calcularFolhaSalarial(){
		double total = 0;
		for (int j = 0; j < i; j++) {
			if (arrayFunc[j] != null && arrayFunc[j].getAtivo()) {
				total += arrayFunc[j].getSalario();
			}
		}
		return total;
	}
}
