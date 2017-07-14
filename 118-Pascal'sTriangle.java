public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows < 1) return result;
        result.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1; j < i; j++) {
                int temp = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
                list.add(temp);
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}