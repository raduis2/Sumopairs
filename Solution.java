import java.util.*;
import java.util.stream.Collectors;
/**
 * Created by radu on 11/24/15.
 */
public class Solution {
    public static void main(String[] args) {
        // args[0] = S; args[1..n] = the values
        List<Integer> v = Arrays.asList(args).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        int S = v.get(0).intValue();
        Map<Integer, Integer> pair = new HashMap<>();
        v.subList(1, v.size()).stream().forEach(x -> pair.put(x, S - x));
        v.subList(1, v.size()).stream()
                .filter(x -> pair.get(x) != null && x < pair.get(x).intValue())
                .forEach(x -> System.out.println(String.format("%d + %d = %d", x, pair.get(x), S)));
    }
}
