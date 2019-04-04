import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int[] indices = null;
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length - i - 1; j++) {
                if ((list[i] + list[j]) == 10) {
                    indices = new int[2];
                    indices[0] = i;
                    indices[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }

    }
}