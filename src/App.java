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

        ab.print();
        System.out.println();
        ab.printPre();
        System.out.println();
        System.out.println(ab.buscar(14) ? "El valor fue encontrado." : "El valor no fue encontrado.");
    }
}
