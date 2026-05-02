public class TesteSistema {
    public static void main(String[] args){
        Departamento TecnologiaDaInformacao = new Departamento("Tecnologia da Informação");
        Funcionario func1 = new Funcionario("Miguel", "123.456.789-00", "Analista de Segurança", 100000.0);
        Funcionario func2 = new Funcionario("Mateus", "098.765.432-11", "Jogador de LOL", 50.0);
        Funcionario func3 = new Funcionario("Isaque", "321.654.987-00", "Programador", 20000.0);
        Funcionario func4 = new Funcionario();

        func4.alterarDados("Keslley", "789.456.123-00", "Vibe Coder", 100.0);

        TecnologiaDaInformacao.adicionarFuncionario(func1);
        TecnologiaDaInformacao.adicionarFuncionario(func2);
        TecnologiaDaInformacao.adicionarFuncionario(func3);
        TecnologiaDaInformacao.adicionarFuncionario(func4);

        func1.aplicarReajuste(15, func1.getSalario());
        func3.demitir();

        TecnologiaDaInformacao.listarFuncionarios();
        System.out.println("\nCálculo da folha salarial: " + TecnologiaDaInformacao.calcularFolhaSalarial());
    }
}