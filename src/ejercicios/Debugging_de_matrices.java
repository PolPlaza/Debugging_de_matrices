package ejercicios;

public class Debugging_de_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Paso 1: Crear una matriz 3x3
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

     // Paso 2: Intentar girar la matriz 90 grados en sentido horario
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Paso 3: Intentar acceder a un índice fuera de los límites
        try {
            System.out.println("\nAccediendo al elemento en [3][0]: " + matrix[3][0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: " + e.toString());
        }

        // Paso 4: Intentar realizar un cálculo incorrecto con la matriz
        try {
            int sum = 0;
            // Intento de sumar los elementos de la matriz de forma incorrecta
            for (int i = 0; i < matrix.length; i++) {  // Corregido: índice máximo es matrix.length - 1
            	for (int j = 0; j < matrix[i].length; j++) {  // Corregido: índice máximo es matrix[i].length - 1
            	    sum += matrix[i][j];
            	}
            }
            System.out.println("\nLa suma de los elementos es: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError al intentar sumar: " + e.toString());
        }
	}

}
