package Matrix.exExample;

import java.util.Scanner;

public class exExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int [n][n]; //Dessa forma indico que e um arranjo Bi Dimensional

        for(int i=0; i<mat.length; i++){ //1for percorre as linhas

            for(int j=0; j<mat[i].length; j++){ //para cada linha eu vou ter mais um laco "FOR" percorrendo as colunas
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for(int i=0; i< mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if(mat [i][j] <0){
                    count ++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();

    }

}
