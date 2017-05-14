package app.com.butterknifetest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {




    @BindView(R.id.textView)TextView textView;
    @BindColor(R.color.colorPrimary) int red;
    @BindString(R.string.dummy) String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        ButterKnife.bind(this);


    }


    @OnClick({R.id.button1,R.id.button2,R.id.button3,R.id.button4})
    public void onClick(View view)
    {
        Button b = (Button)view;
        switch (view.getId())
        {
            case R.id.button1:
                textView.setText(b.getText());
                textView.setTextColor(red);
                break;
            case R.id.button2:
                textView.setText(b.getText());
                break;
            case R.id.button3:
                textView.setText(b.getText());
                break;
            case R.id.button4:
                textView.setText(b.getText());
                break;
        }
    }
}
