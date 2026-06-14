/**
 * Classe ProjetoSocial (Composição - relação "TEM-UM")
 * Um ProjetoSocial NÃO É um Voluntário, mas TEM UM voluntário como líder.
 * Essa é a relação de composição: o projeto "monta" suas peças usando objetos
 * de outras classes, como peças de Lego.
 */
public class ProjetoSocial {

    private String nomeDoProjeto;
    private int metaImpacto;

    // Composição: ProjetoSocial TEM UM Voluntario como líder
    private Voluntario lider;

    // Construtor padrão
    public ProjetoSocial() {
    }

    // Construtor personalizado
    public ProjetoSocial(String nomeDoProjeto, int metaImpacto, Voluntario lider) {
        this.nomeDoProjeto = nomeDoProjeto;
        this.metaImpacto = metaImpacto;
        this.lider = lider;
    }

    // ===== Getters e Setters =====

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public int getMetaImpacto() {
        return metaImpacto;
    }

    public void setMetaImpacto(int metaImpacto) {
        this.metaImpacto = metaImpacto;
    }

    public Voluntario getLider() {
        return lider;
    }

    public void setLider(Voluntario lider) {
        this.lider = lider;
    }

    /**
     * Inicia o projeto, informando seu nome, a meta de impacto,
     * o nome do líder responsável e o setor em que ele atua.
     */
    public void iniciarProjeto() {
        System.out.println("=== Projeto Social ===");
        System.out.println("O projeto \"" + nomeDoProjeto + "\" foi iniciado!");
        System.out.println("Meta de impacto: " + metaImpacto + " pessoas atendidas.");

        if (lider != null) {
            System.out.println("Líder responsável: " + lider.getNome());
            System.out.println("Setor do líder: " + lider.getSetor());
        } else {
            System.out.println("Atenção: este projeto ainda não possui um líder definido.");
        }
    }
}
