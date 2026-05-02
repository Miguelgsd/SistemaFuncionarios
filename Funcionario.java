public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private double salario;
	private boolean ativo = true;

	public Funcionario(String nome, String cpf, String cargo, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario(){
		this.nome = "Indefinido";
		this.cpf = "000.000.000-00";
		this.cargo = "Indefinido";
		this.salario = 0.0;
		this.ativo = false;
	}

	public String getNome(){ 
                return this.nome;
        }

        public String getCpf(){ 
                return this.cpf;
        }

        public String getCargo(){ 
                return this.cargo;
        }

        public double getSalario(){ 
                return this.salario;
        }

        public boolean getAtivo(){ 
                return this.ativo;
        }

	public void alterarDados(String nome, String cpf, String cargo, double salario){
		this.nome = nome;
                this.cpf = cpf;
                this.cargo = cargo;
                this.salario = salario;
	}

	public void aplicarReajuste(double percent, double salario){
		this.salario = salario + (salario * (percent/100));
	}

	public void demitir(){
		this.ativo = false;
	}

	public void exibirDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Salario: " + getSalario());
		
		if(getAtivo()){
			System.out.println("Atividade: ATIVO");
		} else {System.out.println("Atividade: INATIVO");}
	}
}
