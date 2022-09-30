import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countSteps' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY heights as parameter.
     */

    public static long countSteps(List<Integer> heights) {
    // Write your code here
        // Iterator it=heights.iterator();
        // while(it.hasNext()){
        //     if(it.next()-it.next().next())
        // }
        int n=heights.get(0);
        heights.remove(0);
        Collections.sort(heights);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=1;i<=n;j++){
                if(i-j==1||j-i==1){
                    count++;
                }
            }
        }
        // System.out.println(heights);
        return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int heightsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> heights = IntStream.range(0, heightsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.countSteps(heights);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
