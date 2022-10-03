public class Item {
    private String nome;
    private int valor;
    private String tipo;
    
    
    public Item(String nome, int valor,String tipo){
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String toString(){
        return "Nome: "+this.nome+" Atributo"+this.tipo+" Tipo:"+this.tipo;
    }



}
