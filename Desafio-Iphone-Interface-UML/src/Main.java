import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Iphone Ligado");
        do{
            System.out.println("====Escolha uma das opções====");
            System.out.println("1 - Tocar Música atual");
            System.out.println("2 - Pausar música");
            System.out.println("3 - Selecionar Música");
            System.out.println("4 - Ligar para um número");
            System.out.println("5 - Atender ligação");
            System.out.println("6 - Iniciar correiro de voz");
            System.out.println("7 - Exibir página na internet");
            System.out.println("8 - Abrir nova aba");
            System.out.println("9 - Atualizar página");
            System.out.println("0 - Desligar iphone");
            option = scanner.nextInt();
            switch (option){
                case 1 -> iphone.tocar();
                case 2 -> iphone.pausar();
                case 3 -> {
                    System.out.print("Digite o nome da música: ");
                    String nomeMusica = scanner.next();
                    iphone.selecionarMusica(nomeMusica);
                }
                case 4 -> {
                    System.out.print("Digite o número do pretendente: ");
                    String numeroPretendido = scanner.next();
                    iphone.ligar(numeroPretendido);
                }
                case 5 -> iphone.atender();
                case 6 -> iphone.iniciarCorreiroVoz();
                case 7 -> {
                    System.out.print("Digite a URL da página: ");
                    String url = scanner.next();
                    iphone.exibirPagina(url);
                }
                case 8 -> iphone.adicionarNovaAba();
                case 9 -> iphone.atualizarPagina();
                case 0 -> {
                    System.out.println("Desligando Iphone");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida");
            }
        }
        while (true);
    }
}
