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
