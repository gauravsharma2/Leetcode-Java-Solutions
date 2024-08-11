class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap();
        for (int i : nums) {
            hashMap.put(i, i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(i + 1)) {
                result.add(i + 1);
            }
        }
        return result;
}}
