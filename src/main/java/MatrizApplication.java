import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MatrizApplication {

    public static void main(String[] args) {
        
        List<Integer[]> matrix = new ArrayList<>();
        matrix.add(new Integer[]{1, 0, 1, 0, 0});
        matrix.add(new Integer[]{1, 0, 1, 1, 1});
        matrix.add(new Integer[]{1, 1, 1, 1, 1});
        matrix.add(new Integer[]{1, 0, 0, 1, 0});
        Integer maiorArea = maiorArea(matrix);
        System.out.println("O retângulo de maior área possui área de: " + maiorArea);

    }


    public static Integer maiorArea(List<Integer[]> matrix) {
        int m = matrix.size();
        int n = matrix.get(0).length;

        List<Integer> lista = new ArrayList<>();

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                for(int t = 0; t < m-i+1; t++) {
                    for(int z = 0; z < n-j+1; z++){
                        boolean temZero = false;
                        for(int k = 0; k < i; k++) {
                            for(int l = 0; l < j; l++){
                                if(matrix.get(t+k)[z+l] == 0) {
                                    temZero = true;
                                    break;
                                }
                            }

                        }
                        if(!temZero) {
                            lista.add(i*j);
                        }
                    }

                }
            }
        }
        Collections.sort(lista, Collections.reverseOrder());
        return lista.get(0);
    }
}
