package materia.controllers;
import materia.models.*;
import java.util.ArrayList;
import java.util.List;
public class ArbolBinario {
    private Node root;
    private int pesoArbol;
    private boolean equilibrado;
    List<Node> nodosDes = new ArrayList<>();

    public ArbolBinario(){
        this.root=null;
    }

    public void insert(int value){
        root = insertRec(root,value);
    }

    private Node insertRec(Node ref, int value){
        if (ref==null){
            pesoArbol++;
            return new Node(value); 
        }

        if (value<ref.getValor()){
            ref.setIzquierdo(insertRec(ref.getIzquierdo(), value));

        } else if (value>ref.getValor()){
            ref.setDerecho(insertRec(ref.getDerecho(), value));
        }

        return ref;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void printOrden(){
        imprimirInOrden(root);
    }

    private void imprimirInOrden(Node node){
        if (node != null) {
            imprimirInOrden(node.getIzquierdo());
             System.out.print(node.getValor() + " ");
            imprimirInOrden(node.getDerecho());
        }
        
    }

    public void printPre(){
        imprimirPreOrden(root);
    }

    private void imprimirPreOrden(Node node){
        if (node != null) {
            System.out.print(node.getValor() + " ");
            imprimirPreOrden(node.getIzquierdo());
            imprimirPreOrden(node.getDerecho());
        }
    }

    public boolean buscar(int value){
        return buscarRec(root, value) != null;
    }

    private Node buscarRec(Node ref, int value){
        if(ref != null){
            if (ref.getValor() == value){
                return ref;
            }
            if (ref.getValor() > value){
                return buscarRec(ref.getIzquierdo(), value);
            } else {
                return buscarRec(ref.getDerecho(), value);
            }
        }
        return null;
    }

    public int getHeight(){
        
        return getHeightRec(root);
    }

    private int getHeightRec(Node node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeightRec(node.getIzquierdo());
        int rightHeight = getHeightRec(node.getDerecho());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getPeso(){
        return pesoArbol;
    }

    public void getAlturas(){
        
        getAlturasRec(root);
    }

    private void getAlturasRec(Node node){
        int altura;
        if (node != null){
            altura = getHeightRec(node);
            getAlturasRec(node.getIzquierdo());
            System.out.print(node.getValor() + " h:" + altura + ", ");
            getAlturasRec(node.getDerecho());
        } 
    }

    public void factorEquilibrio(){
        factorEquilibrioRec(root);
    }

    private void factorEquilibrioRec(Node node){
        if (node != null) {
            int alturaIzq = getHeightRec(node.getIzquierdo());
            int alturaDer = getHeightRec(node.getDerecho());
            int factor = alturaIzq - alturaDer;
            factorEquilibrioRec(node.getIzquierdo());
            if (factor < -1 || factor > 1) {
                equilibrado = false;
                nodosDes.add(node);
            } else {
                equilibrado = true;
            }
            System.out.print(node.getValor() + " eq:" + factor + ", ");
            factorEquilibrioRec(node.getDerecho());
        }
    }

    public boolean isEquilibrado() {
        return equilibrado;
    }

    public void printNodosDesequilibrados() {
        for (Node node : nodosDes) {
            System.out.print(node.getValor() + " eq:" + (getHeightRec(node.getIzquierdo()) - getHeightRec(node.getDerecho())) + ", ");
        }
    }
}
