/**
 * Classe Voluntario (subclasse de MembroONG)
 * Representa um membro da ONG que atua como voluntário em algum setor.
 */
public class Voluntario extends MembroONG {

    // Atributo específico do voluntário
    private String setor;

    // Construtor padrão
    public Voluntario() {
        super();
    }

    // Construtor personalizado
    public Voluntario(String nome, String cpf, int diasAtuacao, String setor) {
        super(nome, cpf, diasAtuacao);
        this.setor = setor;
    }

    // ===== Getter e Setter =====

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * Sobrescrita do método exibirResumo(), incluindo o setor do voluntário.
     */
    @Override
    public void exibirResumo() {
        System.out.println("=== Voluntário ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Dias de atuação: " + getDiasAtuacao());
        System.out.println("Setor: " + setor);
    }
}
