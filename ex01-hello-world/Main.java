public class PesquisaBinaria {
    public static int pesquisaBinaria(int[] v, int x) {
        int inicio = 0, fim = v.length - 1, meio;
        
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            
            if (x == v[meio]) {
                return meio;
            } else if (x < v[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        
        return -1; // Retorna -1 caso o elemento não seja encontrado
    }
}
