/**
 * Classe SistemaMain
 * Classe de teste responsável por instanciar os objetos do sistema
 * e demonstrar o funcionamento conjunto de herança, encapsulamento e composição.
 */
public class SistemaMain {

    public static void main(String[] args) {

        // 1. Instanciando um Voluntário e preenchendo os dados via Setters
        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Ana Souza");
        voluntario.setCpf("123.456.789-00");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Aulas de Reforço Escolar");

        // 2. Instanciando um Doador e preenchendo os dados via Setters
        Doador doador = new Doador();
        doador.setNome("Carlos Lima");
        doador.setCpf("987.654.321-00");
        doador.setDiasAtuacao(36);
        doador.setValorDoadoMensal(150.0);

        // 3. Instanciando um ProjetoSocial
        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Educação para Todos");
        projeto.setMetaImpacto(200);

        // 4. Atribuindo o voluntário criado como líder do projeto (Composição)
        projeto.setLider(voluntario);

        // 5. Chamando os métodos para provar que tudo funciona em harmonia
        System.out.println("################ SISTEMA DE GESTAO ONG ################\n");

        voluntario.exibirResumo();
        System.out.println();

        doador.exibirResumo();
        System.out.println();

        projeto.iniciarProjeto();
        System.out.println();

        // Teste extra da regra de negócio: dias de atuação não pode ser negativo
        System.out.println("---- Teste da regra de negócio (setDiasAtuacao) ----");
        System.out.println("Tentando definir dias de atuação como -10 para o voluntário...");
        voluntario.setDiasAtuacao(-10);
        System.out.println("Dias de atuação atual (mantido): " + voluntario.getDiasAtuacao());
    }
}
