import java.util.*;
import java.util.stream.Collectors;
/**
 * Created by radu on 11/24/15.
 */
public class Solution {
    public static void main(String[] args) {
        // args[0] = S; args[1..n] = the values
        List<Integer> x = Arrays.asList(args).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        int S = x.get(0).intValue();
        Integer[] v = new Integer[x.size()-1];
        x.subList(1,x.size()).toArray(v);
        Map<Integer, Integer> pair = new HashMap<>();
        for (int i=0; i<v.length; i++) {
            int w = v[i].intValue();
            pair.put(w, S-w);
        }
        for (int i=1; i<v.length; i++) {
            int w = v[i].intValue();
            Integer p = pair.get(v[i]);
            if (p !=null && w < p.intValue()) {
                System.out.println(String.format("%d + %d = %d", w, p.intValue(), S));
            }
        }
    }
}
