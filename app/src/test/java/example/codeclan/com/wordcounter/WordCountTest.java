package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class WordCountTest {

    WordCount counter;
    WordCount counter1;
    String string;
    String string1;

    @Before
    public void before(){
        string = "Hello my dear";
        string1 = "I like spaghetti and I also like burgers";
        counter = new WordCount(string);
        counter1 = new WordCount(string1);
    }

    @Test
    public void canGetString() {
        assertEquals("Hello my dear", counter.getString());
    }

    @Test
    public void canCountWords(){
        assertEquals(3, counter.getWordCount());
    }

    @Test
    public void canCountWords2(){
        assertEquals(8, counter1.getWordCount());
    }
}