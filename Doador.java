/**
 * Classe Doador (subclasse de MembroONG)
 * Representa um membro da ONG que contribui financeiramente todo mês.
 */
public class Doador extends MembroONG {

    // Atributo específico do doador
    private double valorDoadoMensal;

    // Construtor padrão
    public Doador() {
        super();
    }

    // Construtor personalizado
    public Doador(String nome, String cpf, int diasAtuacao, double valorDoadoMensal) {
        super(nome, cpf, diasAtuacao);
        this.valorDoadoMensal = valorDoadoMensal;
    }

    // ===== Getter e Setter =====

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    /**
     * Sobrescrita do método exibirResumo(), exibindo o status de "Doador Ativo"
     * e o valor doado mensalmente.
     */
    @Override
    public void exibirResumo() {
        System.out.println("=== Doador ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Dias de atuação: " + getDiasAtuacao());
        System.out.println("Status: Doador Ativo");
        System.out.printf("Valor doado mensalmente: R$ %.2f%n", valorDoadoMensal);
    }
}
