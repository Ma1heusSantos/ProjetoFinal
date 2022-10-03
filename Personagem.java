public class Personagem {
    private String nome;
    private int forca;
    private int armadura;
    private int vida;
    private int forcaItem;
    private int armaduraItem;

    public Personagem(String nome, int forca, int armadura, int vida) {
        this.nome = nome;
        this.forca = forca;
        this.armadura = armadura;
        this.vida = vida;

    }

    public void adicionarItem(Item item) {
        if (item.getTipo() == "dano") {
            forcaItem += item.getValor();
        } else {
            armaduraItem += item.getValor();
            ;
        }
    }

    public int danoPersonagem() {
        int danoPersonagem = forca + this.forcaItem;
        return danoPersonagem;
    }

    public int armaduraPersonagem() {
        int armaduraPersonagem = this.armadura + this.armaduraItem;
        return armaduraPersonagem;
    }

    public void mostrarPersonagem() {
        System.out.println("------Criando Personagem-------");
        System.out.println("Nome do personagem: " + this.nome);
        System.out.println("Pontos de vida :" + this.vida);
        System.out.println("Dano do pensonagem: " + danoPersonagem());
        System.out.println("Armadura do personagem: " + armaduraPersonagem());
        System.out.println("------------------------------");
    }

    public void verificaHp(int danoRecebido) {
        if (this.vida < 0) {
            System.out.println("O personagem não resistiu ao ataque e morreu!");
            System.out.println("Total de dano recebido: " + danoRecebido);
        } else {
            System.out.println("resistiu e ainda continua de pé!");
            System.out.println("Pontos de vida:" + vida);
        }
    }

    public int subtraiVida(int danoRecebido) {
        this.vida = (this.vida + armaduraPersonagem()) - danoRecebido;
        verificaHp(danoRecebido);
        return this.vida;
    }

    public void ataca(Personagem alvo) {
        int danoRecebido = this.danoPersonagem();
        System.out.println(this.nome + " Ataca " + alvo.nome + ":");
        alvo.subtraiVida(danoRecebido);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}