package github.cesarferreira.jsonify.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import github.cesarferreira.jsonify.JSONify;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResultText(JSONify.from(Factory.createDummyPerson(), true));
                JSONify.print(Factory.createDummyPerson());
            }
        });

    }


    private void setResultText(String text) {
        textView.setText("");
        textView.setText(text);
        //Log.d("tag", text);
    }

}
