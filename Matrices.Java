package matrices;
public class Matrices {
public static void main(String[] args) {int i,j;
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
        //Addition of 2 matrices
        System.out.println("Addition of 2 matrices");
        for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            System.out.print(a[i][j]+b[i][j]+" ");
        }
            System.out.print("\n");
        }
        //Product of 2 matrices
        i=0;j=0;
        int k,sum=0;
        System.out.println("Product of 2 matrices");
        for(i=0;i<3;i++){
        for(j=0;j<3;j++){
        for(k=0;k<3;k++){
        sum=sum+(a[i][k]*b[k][j]);
        }
            System.out.print(sum+" ");
            sum=0;
        }
            System.out.print("\n");
        }
    }
    
}
