import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("alma");
    }


    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        return Arrays.stream(citiesOffered).filter(c -> !Arrays.asList(citiesVisited).contains(c)).findFirst().orElse("No worthwhile conferences this year!");
    }

    public static String describeList(final List list) {
        switch (list.size()) {
            case 0:
                return "empty";
            case 1:
                return "singleton";
            default:
                return "longer";
        }
    }

    public static int solve(int[] arr) {
        List<Integer> primes = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            sum += arr[i];
        }
        return sum;
    }


    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int sum = 0;
        for (int i = 0; i < ls.size() - 2; i++) {
            for (int j = 1; j < ls.size() - 1; j++) {
                for (int l = 2; l < ls.size(); l++) {
                    if (ls.get(i) + ls.get(j) + ls.get(l) > sum &&
                            ls.get(i) + ls.get(j) + ls.get(l) <= t) {
                        sum = ls.get(i) + ls.get(j) + ls.get(l);
                    }
                }
            }
        }
        return sum == 0 ? null : sum;
    }

    public static String getWinner(final List<String> listOfBallots) {
        int aVote =(int) listOfBallots.stream().filter(v->v.equalsIgnoreCase("a")).count();
        int bVote =(int) listOfBallots.stream().filter(v->v.equalsIgnoreCase("b")).count();
        if(2*bVote<listOfBallots.size()){
            return "A";
        }
        if(2*aVote<listOfBallots.size()){
            return "B";
        }
        return null;
    }
}

