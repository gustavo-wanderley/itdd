import cargos.*;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gustavo");
        Funcionario funcionario = new Funcionario("João");
        gerente.adicionarGratificacaoDesempenho();
        gerente.adicionarGratificacaoHoraExtra(10);

        Memoria memoria = new Memoria();
        memoria.adicionarFuncionario(funcionario);
        memoria.adicionarGerente(gerente);

        Empregado empregado = memoria.buscarEmpregado("Gustavo");
        empregado.exibirGratificacoes();

        memoria.exibirFolhadePagamento();

        empregado.removerGratificacao(0);
    }
}
