package P4_List_Utilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> first = List.of(13, 42, 69, 79);
        List<String> second = List.of("13", "42", "69", "79");

        System.out.println(ListUtils.getMin(first));
        System.out.println(ListUtils.getMax(second));
    }
}
