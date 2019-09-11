import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0; 
        int bob = 0;
        for(int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i)) alice++;
            else if(a.get(i) < b.get(i)) bob++;
        }

        List<Integer> results = new ArrayList<>();
        results.add(alice); 
        results.add(bob);
        return results;
    }
}
