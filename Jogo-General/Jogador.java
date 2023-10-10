import java.io.Serializable;

public class Jogador implements Serializable{

    private String nome;
    private String tipo;
    private JogoGeneral General ;

    public Jogador(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.General = new JogoGeneral();
    }
    public void validarJogada(int escolha)
    {
        switch (escolha){
            case 1:
                General.Jogada_de_1();
                break;
            case 2:
                General.Jogada_de_2();
                break;
            case 3:
                General.Jogada_de_3();
                break;
            case 4:
                General.Jogada_de_4();
                break;
            case 5:
                General.Jogada_de_5();
                break;
            case 6:
                General.Jogada_de_6();
                break;
            case 7:
                General.Trinca();
                break;
            case 8:
                General.Quadra();
                break;
            case 9:
                General.FullHand();
                break;
            case 10:
                General.Sequencia_alta();
                break;
            case 11:
                General.Sequencia_baixa();
                break;
            case 12:
                General.General();
                break;
            case 13:
                General.Jogada_aleatoria();
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente");
                break;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    public void jogarDados() { 
        General.rolarDados();
        System.out.println("Jogador " + nome + " jogou o dado e obteve: " );
        General.mostraValorDados();
    }
    public void mostraJogadasExecutadas() {
        System.out.println("\nJogadas executadas por " + nome + ": ");
        General.mostraJogadas();
    }
}