public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        if(rowIndex < 0) return result;
        for(int k = 0; k < rowIndex + 1; k++) {
            result.add(1);
        }
        for(int i = 1; i <= rowIndex; i++) {
            for(int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        return result;
    }
}