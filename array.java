public class array
{
    public static void main(String[] args)
    {
        int Array[],Array2[][],k,i,z,j;
        k= 0;
        i = 0;
        z = 0;
        Array2 = new int[4][4];
        Array = new int[9];
        Array[0] = 0;
        Array[1] = 1;
        Array[2] = 5;
        Array[3] = 2;
        Array[4] = 6;
        Array[5] = 1;
        Array[6] = 0;
        Array[7] = 2;
        Array[8] = 5;

        while (i <= 3)
        {
            if (i < 3)
            {   
                Array2[k][i] = Array[z];
                z = z+1;
                i = i+1;
            }
            else if(i == 3 & k < 2)
            {
                i =0;
                k = k+1;
            }
            else
            {
               i = 4;
            }
        }
        for (i = 0;i <3;i++){
            for (j = 0;j<3;j++){
                System.out.print(Array2[i][j]);
                System.out.print(" ");
            }System.out.println("\t");
        }
    }   
}