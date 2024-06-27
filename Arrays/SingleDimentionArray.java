package Arrays;

public class SingleDimentionArray {
    public static void main ( String[] args ) {
//        Declaring single dimension Array
//        int[] marks;
//        marks = new int[6];
//        OR
//        int[] marks = new int[6];

//        Initializing an Array
//        int[] marks = new int[] { 10,2,4,5,6,7};

//        Declaring And Assign
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 10;
        marks[2] = 10;
        marks[3] = 10;
        marks[4] = 10;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("***********");

        for(int value : marks){
            System.out.println(value);
        }



    }
}
