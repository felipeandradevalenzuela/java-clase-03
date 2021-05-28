public class Celular implements Precedable<Celular>{
    
    private int numero;
    private String titular;
    
    public Celular() {
        this.numero = 0;
        this.titular = "";
    }

    public Celular(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular t) {
        // TODO Auto-generated method stub
        return 0;
    }

}
