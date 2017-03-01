/**
 * TextProcessorImpl.java
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class TextProcessorImpl implements TextProcessor{

    private Scanner openedFile;
    public static final int EXPECTED_NUM_WORDS = 1;
    private ArrayList<String> words;

    /**
     * Initialize an instance of TextProcessor with the file
     * that it should read. Words containing the digits 0-9 are
     * ignored, and any punctuation in a word is stripped before
     * storage. (This does have the unfortunate consequence
     * of storing "don't" as the four-letter word "dont".
     * It does not mess up accented letters as in "fÃ¼nf" or "tÃº".)
     * After the constructor returns, the new instance will
     * have all the information it needs to do analysis; the file
     * will not be needed again.
     * @param fileName - the name of the file to be opened (Program will fail if file can't be opened.)
     */
    public TextProcessorImpl(String fileName) {
        this.openedFile = TextReader.openFile(fileName);
        words = new ArrayList<String>();
        while (openedFile.hasNext()) {
            ArrayList<String> newWords = new ArrayList<String>(Arrays.asList(openedFile.next().split("[\\p{P}&&[^\u0027]]")));
            for (String q: newWords){
                if (!(q.contains("0")||
                        q.contains("1")||
                        q.contains("2")||
                        q.contains("3")||
                        q.contains("4")||
                        q.contains("5")||
                        q.contains("6")||
                        q.contains("7")||
                        q.contains("8")||
                        q.contains("9"))&&
                        q.length()>=1) {

                    words.add(q);
                }
            }
        }
    }

    /**
     * Return the letters that are most likely to appear at
     * the start of a word from the literary work. Frequency
     * of the words involved is not taken into account. There
     * will often only be one letter, but in case of a tie,
     * a collection is returned.
     *
     * @return the most common first letter(s) in the words
     */
    @Override
    public Collection<Character> mostCommonFirstUnweighted() {
        return null;
    }

    /**
     * Return the longest word or words from the literary work.
     * There will often only be one word, but in case of a tie,
     * a collection is returned.
     *
     * @return the longest word(s)
     */
    @Override
    public Collection<String> getLongestWords() {
        ArrayList<String> longestWords = new ArrayList<String>();
        if (!words.isEmpty()) {
            longestWords.add(words.get(0));
        }else {
            return null;
        }
        for (String newWord: words) {

                if (newWord.length() > longestWords.get(0).length()) {
                    longestWords = new ArrayList<String>();
                    longestWords.add(newWord);
                } else if (newWord.length() == longestWords.get(0).length()) {
                    longestWords.add(newWord);
                }

        }
        return longestWords;
    }

    /**
     * Return the shortest word or words from the literary work.
     * Since most languages contain many 1-letter words,
     * a collection is returned.
     *
     * doesn't work properly (im assuming it is due to a failure in populating words properly based on my testing
     * but im out of time and can't find the error)
     *
     * @return the shortest word(s)
     */
    @Override
    public Collection<String> getShortestWords() {
        ArrayList<String> shortestWords = new ArrayList<String>();
        if (!words.isEmpty()) {
            shortestWords.add(words.get(0));
        }else {
            return null;
        }
        for (String newWord: words) {

            if (newWord.length() < shortestWords.get(0).length()) {
                shortestWords = new ArrayList<String>();
                shortestWords.add(newWord);
            } else if (newWord.length() == shortestWords.get(0).length()) {
                shortestWords.add(newWord);
            }

        }
        return shortestWords;
    }

    /**
     * Return the most common word or words of a given
     * length in the literary work. There will often
     * only be one such word, but in case of a tie,
     * a collection is returned.
     *
     * @param length the length of words to consider
     * @return the list of most common words
     */
    @Override
    public Collection<String> mostCommon(int length) {
        return null;
    }

    /**
     * Return the letters that are most likely to appear at
     * the start of a word from the literary work. Frequency
     * of the words involved is taken into account. There
     * will often only be one letter, but in case of a tie,
     * a collection is returned.
     *
     * @return the most common first letter(s) in the words
     */
    @Override
    public Collection<Character> mostCommonFirstWeighted() {
        return null;
    }
}
