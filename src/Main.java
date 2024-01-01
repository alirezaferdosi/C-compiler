

public class Main {
    public static void main(String[] args) {


        lexicalanalyzer lexim = new lexicalanalyzer();
        lexim.Scanner();
        Syntaxanalyzer object = new Syntaxanalyzer();
        object.parser(Graph.ParsingTable,lexim.set);

    }

}
