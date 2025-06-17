package materia.controllers;
import materia.models.*;
public class ArbolBinario {
    private Node root;

    public ArbolBinario(){
        this.root=null;
    }

    public void insert(int value){
        root = insertRec(root,value);
        
    }

    private Node insertRec(Node ref, int value){
        if (ref==null){
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

    public void print(){
        imprimir(root);
    }

    private void imprimir(Node node){
        if (node != null) {
            imprimir(node.getIzquierdo());
             System.out.print(node.getValor() + " ");
            imprimir(node.getDerecho());
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
}
