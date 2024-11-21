public class Studente {
    String nome;
    int eta;

    public Studente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
    }

    public static void main(String[] args) {
        Studente studente = new Studente("Luca", 20);
        studente.saluta();
    }
}