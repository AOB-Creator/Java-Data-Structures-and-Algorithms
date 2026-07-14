import java.util.Arrays;

public class Leetcode_130720_Tasks {
    //    3898. Find the Degree of Each Vertex
    public int[] findDegrees(int[][] matrix) {
        int matrixLeng = matrix.length;
        int[] degree = new int[matrixLeng];
        for (int i = 0; i < matrixLeng; i++){
            int degreeItem = 0;
            for(int j=0; j < matrixLeng; j++){
                if(matrix[i][j] == 1){
                    degreeItem ++;
                }
            }
            degree[i] = degreeItem;
        }
        return degree;
    }

    // 771. Jewels and Stones
    public int numJewelsInStones(String jewels, String stones) {
        int amount = 0;
        for (int j = 0; j < jewels.length(); j++){
            for (int s = 0; s < stones.length(); s++){
                if(jewels.charAt(j) == stones.charAt(s)){
                    amount++;
                }
            }
        }
        return amount;
    }

    // 1108. Defanging an IP Address
    public String defangIPAddress(String address) {
        return address.replace(".", "[.]");
    }

    // 2325. Decode the Message
    public String decodeMessage(String key, String message) {
       StringBuilder sb = new StringBuilder("Hello World");
       for (int i = 0; i < 10; i++){
           if (i % 3 == 0){
               sb.append(i).append(" ");
           }else{
               sb.append(i);
           }

       }
       sb.reverse();
       sb.delete(1, 3);
       sb.replace(1,3,"Java");
       sb.insert(3,"Jon");
       System.out.println(sb.substring(3, 8));
       int capasity = sb.capacity();
       String sbText = sb.toString();

       for (int k = 0; k < sb.length(); k++){
           if(k % 2 == 0){
               System.out.println(sb.charAt(k));
           }
       }

       return sbText;
    }




}
