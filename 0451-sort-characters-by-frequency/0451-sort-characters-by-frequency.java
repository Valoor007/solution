class Solution {
    public String frequencySort(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        List<String> groups = new ArrayList<>();  
        int i = 0;
        while (i < sArr.length) {
            int count = 1;
            while (i + count < sArr.length && sArr[i] == sArr[i + count]) {
                count++;
            }
            String repeated = "";
        for (int k = 0; k < count; k++) {
                repeated += sArr[i];
        }
            groups.add(repeated);  
     i += count;
        }

        groups.sort((a, b) -> b.length() - a.length());
        String result = "";
            for (String g : groups) {
            result += g;
        }
        return result;
    }
}