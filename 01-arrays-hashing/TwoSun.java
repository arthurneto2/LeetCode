class TwoSun {
    public int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];
        int posicaoJ = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = posicaoJ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
            posicaoJ++;
        }

        return output;

    }
}
