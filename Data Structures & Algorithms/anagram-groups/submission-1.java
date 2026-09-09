class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String words : strs){
            char[] ch = words.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(words);
        }
        return new ArrayList<>(groups.values());
    }
}
