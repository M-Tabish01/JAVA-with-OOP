
package arrays;


public class Arrays {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 93;
        marks[2] = 87;
        
        boolean[] bool = new boolean[2];
        bool[1]= false;
        System.out.println(bool[0]);

        String[][] string = {{"tabish", "Hammad"},{ "Junaid","Saim"}};
        System.out.println(string[0][1]);
        
        int[][] FinalMarks = {{12,34},{23,45}};
        System.out.println(FinalMarks[0][1]);
    }
    
}
