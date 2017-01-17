package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText stringEditText;
    TextView numberText ;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringEditText = (EditText)findViewById(R.id.question_text);
        numberText = (TextView)findViewById(R.id.answer_text);
        button = (Button)findViewById(R.id.button);
    }

    public void buttonClicked(View button){
        Log.d(getClass().toString(), "button was called"); //response on the console
    }

    public void onButtonClicked(View button){
        String string = stringEditText.getText().toString();
        Log.d(getClass().toString(), "The button was pressed");
        Log.d("WordCount:", "The string to process was" + string + "");
        WordCount counter = new WordCount(string);
        int number = counter.getWordCount();
        numberText.setText(number);
    }


}
