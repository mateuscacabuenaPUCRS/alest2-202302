package aula20_grafos.matriz_adjacencia;

public class MatrizAdjacenciaApp {
    public static void main(String[] args) {
        Grafo g = new Grafo(3);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0,2);
        System.out.println(g.toDot());
    }
}
