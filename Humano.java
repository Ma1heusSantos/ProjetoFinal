import java.util.Scanner;

public class Humano extends Personagem {
    private String classePersonagem;

    Scanner dado = new Scanner(System.in);

    public Humano(String nome,int forca,int armadura,int vida,String classePersonagem){
        super(nome, forca, armadura, vida);
        this.classePersonagem = classePersonagem;

    }
    
    
    public void menu(){
        System.out.println("Seja bem-vindo ao Prototipo:");
        System.out.println(" com qual classe voce gostaria de jogar ?");
        System.out.println("[1] Guerreiro");
        System.out.println("[2] Arqueiro");
        System.out.println("[3] Mago");
    }
 

        

}
