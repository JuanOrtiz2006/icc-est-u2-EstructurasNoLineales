import materia.controllers.*;;
public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario ab = new ArbolBinario();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        System.out.println("Nombre: Juan Ortiz");
        System.out.println();

        System.out.println("Peso del arbol: " + ab.getPeso());
        System.out.println("Altura del arbol: " + ab.getHeight());
        
        System.out.println();
        System.out.println("Arbol InOrden");
        ab.printOrden();

        System.out.println();
        System.out.println("Arbol InOrden con alturas");
        ab.getAlturas();

        System.out.println();
        System.out.println("Arbol InOrden con factores de equilibrio");
        ab.factorEquilibrio();

        System.out.println();
        System.out.println();
        System.out.println("Arbol esta equilibrado: " + ab.isEquilibrado());
        System.out.println("Agregando valor:" + 15);
        ab.insert(15);

        System.out.println();
        System.out.println("Arbol InOrden con factores de equilibrio");
        ab.factorEquilibrio();
        System.out.println();
    
        System.out.println("Nodos desequilibrados:");
        ab.printNodosDesequilibrados();

  
    }
}
