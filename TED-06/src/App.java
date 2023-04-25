public class App {
    public static void main(String[] args) {
        ServicoStreaming netflix = new ServicoStreaming();

        Filme filme1 = new Filme("A fulga das galinhas.", 95);
        Filme filme2 = new Filme("Blade II",173);
        Filme filme3 = new Filme("As Branquelas", 156);
        Filme filme4 = new Filme("O homem que dasafiou o diabo.", 205);
        Serie serie1 = new Serie("Vikings", 62);
        Serie serie2 = new Serie("Você", 43);
        Serie serie3 = new Serie("The office", 113);
        Serie serie4 = new Serie("The last of us", 9);


        netflix.adicionarFilme(filme1);
        netflix.adicionarFilme(filme2);
        netflix.adicionarFilme(filme3);
        netflix.adicionarFilme(filme4);
        netflix.adicionarSerie(serie1);
        netflix.adicionarSerie(serie2);
        netflix.adicionarSerie(serie3);
        netflix.adicionarSerie(serie4);

        Usuario usuario1 = new Usuario("Luiz");
        Usuario usuario2 = new Usuario("Sergio");
        Usuario usuario3 = new Usuario("Ewerton");
        Usuario usuario4 = new Usuario("Gonçalo");

        usuario1.assistirFilme(filme1);
        usuario1.assistirFilme(filme3);
        usuario1.assistirSerie(serie4);
        usuario1.assistirSerie(serie2);

        usuario2.assistirFilme(filme3);
        usuario2.assistirFilme(filme2);
        usuario2.assistirSerie(serie3);

        usuario3.assistirSerie(serie2);

        usuario4.assistirSerie(serie4);
        usuario4.assistirSerie(serie3);
        usuario4.assistirSerie(serie1);


        System.out.println("Usuário " + usuario1.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario1.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }

        System.out.println("Usuário " + usuario1.getNome() + " assistiu as séries:");
        for (Serie serie : usuario1.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }

        System.out.println("Usuário " + usuario2.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario2.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }
        System.out.println("Usuário " + usuario2.getNome() + " assistiu as séries:");
        for (Serie serie : usuario2.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }

        System.out.println("Usuário " + usuario3.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario1.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }

        System.out.println("Usuário " + usuario3.getNome() + " assistiu as séries:");
        for (Serie serie : usuario1.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }

        System.out.println("Usuário " + usuario4.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario2.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }

        System.out.println("Usuário " + usuario4.getNome() + " assistiu as séries:");
        for (Serie serie : usuario2.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }
    }
}