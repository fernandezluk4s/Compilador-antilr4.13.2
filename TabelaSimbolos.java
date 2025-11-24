import java.util.*;

public class TabelaSimbolos {
    // Pilha de escopos
    private Stack<Map<String, Simbolo>> escopos = new Stack<>();

    public TabelaSimbolos() {
        escopos.push(new HashMap<>()); // Escopo Global
    }

    public void entrarEscopo() { escopos.push(new HashMap<>()); }
    public void sairEscopo() { escopos.pop(); }

    public void declarar(String nome, String tipo, boolean constante, boolean isArray, int tam) {
        Map<String, Simbolo> atual = escopos.peek();
        if (atual.containsKey(nome)) throw new RuntimeException("Erro: '" + nome + "' já existe.");
        
        Object valorInicial = isArray ? new Object[tam] : null;
        atual.put(nome, new Simbolo(nome, tipo, valorInicial, constante));
    }

    public Simbolo buscar(String nome) {
        for (int i = escopos.size() - 1; i >= 0; i--) {
            if (escopos.get(i).containsKey(nome)) return escopos.get(i).get(nome);
        }
        throw new RuntimeException("Erro: Variável '" + nome + "' não declarada.");
    }

    public void imprimir() {
        System.out.println("\n--- Tabela de Símbolos (Escopo Atual) ---");
        if (escopos.isEmpty()) {
            System.out.println("(Vazia)");
            return;
        }
        for (Simbolo s : escopos.peek().values()) {
            System.out.println(s);
        }
    }
}

class Simbolo {
    String nome, tipo;
    Object valor;
    boolean constante;
    
    public Simbolo(String n, String t, Object v, boolean c) {
        nome = n; tipo = t; valor = v; constante = c;
    }
    
    @Override // Apenas UM @Override aqui
    public String toString() {
        String valStr = "null";
        if (valor != null) {
            valStr = valor.toString();
            // Se for um array, usa o formatador do Java para mostrar [1, 2, 3]
            if (valor instanceof Object[]) {
                valStr = Arrays.toString((Object[]) valor);
            }
        }
        
        return String.format("Nome: %-10s Tipo: %-6s Const: %-5s Valor: %s", 
                             nome, tipo, constante, valStr);
    }
}