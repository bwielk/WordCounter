package example.codeclan.com.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by user on 17/01/2017.
 */
public class WordCount extends AppCompatActivity {

    String string;

    public WordCount(String string){
        this.string = string;
    }

    public String getString(){
        return this.string;
    }

    public int getWordCount(){
      return getString().split(" ").length;
    }
}
