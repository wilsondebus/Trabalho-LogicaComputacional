import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        // Lista para armazenar os candidatos lidos do arquivo CSV
        ArrayList<Candidato> candidatos = new ArrayList<>();

        // Leitura do arquivo CSV
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("base_de_dados.csv"));

            // Lê a primeira linha do arquivo e ignora, pois é o cabeçalho
            String linha = leitor.readLine();

            // Enquanto existir linha no arquivo, continua lendo
            while ((linha = leitor.readLine()) != null) {

                // Separa os dados da linha usando vírgula
                String[] dados = linha.split(",");

                // Verifica se a linha possui todas as colunas necessárias
                if (dados.length < 6) {
                    System.out.println("Linha com problema: " + linha);
                    continue;
                }

                // Guarda cada informação em uma variável
                String id = dados[0];
                String nome = dados[1];
                int idade = Integer.parseInt(dados[2]);
                int experiencia = Integer.parseInt(dados[3]);

                // Converte Sim para true e Não para false
                boolean tecnico = dados[4].equalsIgnoreCase("Sim");
                boolean ingles = dados[5].equalsIgnoreCase("Sim");

                // Cria um objeto Candidato com os dados lidos
                Candidato candidato = new Candidato(id, nome, idade, experiencia, tecnico, ingles);

                // Adiciona o candidato na lista
                candidatos.add(candidato);
            }

            // Fecha o leitor do arquivo
            leitor.close();

        } catch (IOException erro) {
            System.out.println("Erro ao ler o arquivo CSV.");
            System.out.println("Detalhe do erro: " + erro.getMessage());
        }

        // DESAFIO 1
        // Exibir candidatos com maioridade legal E curso técnico completo
        System.out.println("DESAFIO 1 - Maioridade legal E curso técnico completo");

        for (Candidato c : candidatos) {
            if (c.getIdade() >= 18 && c.temTecnico()) {
                System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome());
            }
        }

        // DESAFIO 2
        // Exibir candidatos com pelo menos 3 anos de experiência OU inglês
        System.out.println("\nDESAFIO 2 - Experiência mínima de 3 anos OU inglês");

        for (Candidato c : candidatos) {
            if (c.getExperiencia() >= 3 || c.temIngles()) {
                System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome());
            }
        }

        // DESAFIO 3
        // Exibir candidatos com menos de 25 anos
        // E que tenham curso técnico OU pelo menos 1 ano de experiência
        System.out.println("\nDESAFIO 3 - Menos de 25 anos E alguma qualificação");

        for (Candidato c : candidatos) {
            if (c.getIdade() < 25 && (c.temTecnico() || c.getExperiencia() >= 1)) {
                System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome());
            }
        }

        // DESAFIO 4
        // Classificar candidatos como SÊNIOR ou JÚNIOR
        System.out.println("\nDESAFIO 4 - Classificação Salarial");

        for (Candidato c : candidatos) {
            if (c.getExperiencia() > 5) {
                System.out.println("Nome: " + c.getNome() + " | Categoria: SÊNIOR");
            } else {
                System.out.println("Nome: " + c.getNome() + " | Categoria: JÚNIOR");
            }
        }
    }
}