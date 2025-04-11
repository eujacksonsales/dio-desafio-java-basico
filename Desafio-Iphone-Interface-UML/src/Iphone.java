public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void inicarCorreiroVoz() {
        System.out.println("Iniciando correiro de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Essa URL: "+ url +" é uma página de receita de bolo de cenoura fofinho ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }


    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " achada");
    }

}
