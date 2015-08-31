package github.cesarferreira.jsonify.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import github.cesarferreira.jsonify.JSONify;
import github.cesarferreira.jsonify.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button)
    Button button;

    @Bind(R.id.textview)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.button)
    public void clickMe() {

        setResultText(JSONify.frome(Factory.createDummyPerson()));
    }

    private void setResultText(String text) {
        textView.setText("");
        textView.setText(text);
        Log.d("tag", text);
    }

}
