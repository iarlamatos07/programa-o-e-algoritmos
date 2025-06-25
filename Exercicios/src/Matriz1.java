public class Matriz1 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {3, 4}
        };

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        
        }
    }
}