package Arrays;

public class MultiDimentionalArray {
    public static void main ( String[] args ) {
        int marks[][] = { {23,33,4,5,11}, {6,7,8,8,9}, {1,2,3,4,56} };

        for(int i = 0; i < 3; i++){
            for(int j=0; j < 5; j++){
                System.out.println(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
