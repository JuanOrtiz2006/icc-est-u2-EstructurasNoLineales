package materia.models;

public class Node {
    private int valor;
    private Node izquierdo;
    private Node derecho;

    public Node(int valor){
        this.valor=valor;
        this.izquierdo=null;
        this.derecho=null;
    }

    public Node getDerecho() {
        return derecho;
    }

    public Node getIzquierdo() {
        return izquierdo;
    }

    public int getValor() {
        return valor;
    }

    public void setDerecho(Node derecho) {
        this.derecho = derecho;
    }

    public void setIzquierdo(Node izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }
    
}
