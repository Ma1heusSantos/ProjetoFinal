public class Principal {
    public static void main(String[] args) {
        Personagem gatinhoMacio = new Personagem("Gatinho Macio", 10, 5, 200);
        Personagem demo = new Personagem("demo", 15, 20, 200);

        Item escudo = new Item("escudo", 20, "defesa");
        Item espada = new Item("Espada", 10, "dano");

        demo.mostrarPersonagem();
        demo.adicionarItem(escudo);
        demo.mostrarPersonagem();

        gatinhoMacio.mostrarPersonagem();
        gatinhoMacio.adicionarItem(espada);
        gatinhoMacio.mostrarPersonagem();
        demo.ataca(gatinhoMacio);

    }

}
