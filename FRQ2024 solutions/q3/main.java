A.
    public boolean isWordChain(List<String> wordList) {
    if (wordList.size() < 2) {
        return false; 
    }
    for (int i = 1; i < wordList.size(); i++) {
        if (!wordList.get(i).contains(wordList.get(i - 1))) {
            return false;
        }
    }
    return true;
}

B.
    public ArrayList<String> createList(String target, List<String> wordList) {
    ArrayList<String> newList = new ArrayList<>();
    for (String word : wordList) {
        if (word.startsWith(target)) {
            newList.add(word.substring(target.length()));
        }
    }
    return newList;
}
