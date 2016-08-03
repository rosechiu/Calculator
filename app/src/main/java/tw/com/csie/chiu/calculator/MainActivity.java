package tw.com.csie.chiu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button Btn_0,Btn_1,Btn_2,Btn_3,Btn_4,Btn_5,Btn_6,Btn_7,Btn_8,Btn_9;
    public Button Btn_Add,Btn_Min,Btn_Mul,Btn_Div,Btn_Ans,Btn_Clear;
    public TextView editTXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
