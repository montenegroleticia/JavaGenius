package Quizz.repositories;

import Quizz.entities.Question;

public class QuestionRepository {
    public static Question[] initializeQuestions() {
        Question[] questions = new Question[10];

        questions[0] = new Question(
                "Qual é a palavra-chave utilizada para indicar que um método não retornará nenhum valor?",
                new String[] { "void", "null", "empty", "none" }, 1);

        questions[1] = new Question("Qual destes é um tipo primitivo em Java?",
                new String[] { "String", "Integer", "Char", "Float" }, 3);

        questions[2] = new Question("Em Java, como você cria um objeto de uma classe?",
                new String[] { "Usando a palavra-chave 'new'", "Usando a palavra-chave 'object'",
                        "Usando a palavra-chave 'create'", "Usando a palavra-chave 'instance'" },
                1);

        questions[3] = new Question("Qual é a estrutura de controle usada para iterar sobre uma coleção em Java?",
                new String[] { "while", "for", "loop", "if" }, 2);

        questions[4] = new Question(
                "Em Java, qual palavra-chave é usada para indicar que uma classe não pode ser herdada?",
                new String[] { "final", "private", "static", "sealed" }, 1);

        questions[5] = new Question("Qual é a diferença entre '==' e '.equals()' em Java?",
                new String[] { "Não há diferença", "'==' compara valores, '.equals()' compara referências",
                        "'.equals()' compara valores, '==' compara referências",
                        "'==' e '.equals()' são usados para comparar valores" },
                3);

        questions[6] = new Question("Qual é a interface principal para implementação de coleções em Java?",
                new String[] { "List", "Array", "Set", "Collection" }, 1);

        questions[7] = new Question("Qual é a diferença entre 'public', 'private' e 'protected' em Java?",
                new String[] {
                        "'public' pode ser acessado por qualquer classe, 'private' apenas pela própria classe, 'protected' apenas pela mesma package",
                        "'public' pode ser acessado por qualquer classe, 'private' apenas pela própria classe, 'protected' pode ser acessado por qualquer classe na mesma package e por subclasses",
                        "'public' pode ser acessado por qualquer classe, 'private' apenas pela própria classe, 'protected' pode ser acessado por qualquer classe na mesma package",
                        "'public', 'private' e 'protected' são todos iguais em Java" },
                2);

        questions[8] = new Question(
                "Em Java, qual é o nome do método chamado automaticamente quando um objeto é criado?",
                new String[] { "start()", "run()", "execute()", "constructor()" }, 4);

        questions[9] = new Question("Qual é a principal finalidade do operador 'new' em Java?",
                new String[] { "Criar uma nova variável", "Alocar memória para um novo objeto",
                        "Atualizar uma variável existente", "Inicializar uma variável com um valor específico" },
                2);

        return questions;
    }
}
