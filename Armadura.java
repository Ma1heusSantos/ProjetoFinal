public class Armadura {
    private String nome;
    private int bonusArmadura;
    

    public Armadura(String nome, int bonusArmadura) {
        this.nome = nome;
        this.bonusArmadura = bonusArmadura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonusArmadura() {
        return bonusArmadura;
    }

    public void setBonusArmadura(int bonusArmadura) {
        this.bonusArmadura = bonusArmadura;
    }

   

}