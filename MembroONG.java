/**
 * Classe MembroONG (superclasse)
 * Representa qualquer pessoa vinculada à ONG, seja voluntário ou doador.
 * Encapsula os dados básicos: nome, cpf e dias de atuação.
 */
public class MembroONG {

    // Atributos privados (Encapsulamento)
    private String nome;
    private String cpf;
    private int diasAtuacao;

    // Construtor padrão
    public MembroONG() {
    }

    // Construtor personalizado
    public MembroONG(String nome, String cpf, int diasAtuacao) {
        this.nome = nome;
        this.cpf = cpf;
        setDiasAtuacao(diasAtuacao);
    }

    // ===== Getters e Setters =====

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    /**
     * Regra de negócio: não permite valores negativos para dias de atuação.
     * Caso o valor seja inválido, a alteração é ignorada e um aviso é exibido.
     */
    public void setDiasAtuacao(int diasAtuacao) {
        if (diasAtuacao < 0) {
            System.out.println("Aviso: não é possível definir dias de atuação negativos. "
                    + "Valor informado (" + diasAtuacao + ") foi ignorado.");
            return;
        }
        this.diasAtuacao = diasAtuacao;
    }

    /**
     * Exibe um resumo básico do membro.
     * Pode ser sobrescrito pelas subclasses para incluir informações específicas.
     */
    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Dias de atuação: " + diasAtuacao);
    }
}
