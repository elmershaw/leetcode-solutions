import java.util.ArrayList;
import java.util.Arrays;

public class MaxFlowMinCut_SCM {
    public static void MFMC(int[][] A){
        int min = 1000000;

        String binaryCode;
        int[] temp = {0,0,0,0,0,0,0,0};

        for (int i = 0; i < Math.pow(2,8); i++){
            ArrayList<Integer> v1 = new ArrayList<Integer>();
            ArrayList<Integer> v2 = new ArrayList<Integer>();
            v1.add(0);
            v2.add(9);
            binaryCode = Integer.toBinaryString(i);
            //System.out.print(binaryCode.length());
            for (int j = 0; j < binaryCode.length(); j++){
                if (binaryCode.charAt(j) == '1'){
                    temp[temp.length - binaryCode.length() + j] = 1;
                }

            }
            System.out.println(binaryCode);
            for (int x = 1; x < 9; x++){
                if (temp[x-1] == 1)
                    v1.add(x);
                else
                    v2.add(x);
            }
            int sum = 0;
            for (int j = 0; j < v1.size(); j++){
                for (int n = 0; n < v2.size(); n++){
                    if (A[v1.get(j)][v2.get(n)] != 0)
                        sum += A[v1.get(j)][v2.get(n)];

                }
            }

            System.out.print(Arrays.toString(temp));
            System.out.println(sum);
            if (sum < min)
                min = sum;
            for (int t = 0; t < 8; t++){
                temp[t] = 0;
            }
        }
        System.out.printf("minimum is :%d", min);

    }

    public static void Ford_Fulkerson_algorithm(int[][] A) {

    }

    public static void main(String[] args){
        int[][] A = new int[10][10];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                A[i][j] = 0;
            }
        }
        A[0][1] = 31;
        A[0][2] = 14;
        A[0][3] = 26;

        A[1][4] = 6;
        A[1][7] = 12;
        A[2][5] = 5;
        A[2][6] = 9;
        A[3][5] = 4;
        A[3][7] = 8;
        A[3][8] = 10;
        A[4][9] = 15;
        A[5][9] = 20;

        A[6][9] = 9;
        A[7][9] = 10;
        A[8][9] = 17;
        MFMC(A);
    }
}
