package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputNumber;
    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonC;
    private Button buttonPlus;
    private Button buttonEqual;

    private int number1;
    private int number2;
    private int result;

    enum Sign{
        plus, minus, mul, div
    }
    private Sign sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber=findViewById(R.id.numberInput);

        buttonNumber1=findViewById(R.id.buttonNumber1);
        buttonNumber2=findViewById(R.id.buttonNumber2);
        buttonNumber3=findViewById(R.id.buttonNumber3);
        buttonC=findViewById(R.id.buttonC);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonEqual=findViewById(R.id.buttonEqual);

        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
            case R.id.buttonC:{
                inputNumber.setText("");
                break;
            }
            case R.id.buttonSqrt:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText(String.valueOf(result));
                number1=result;
                break;
            }
            case R.id.buttonNumber1:{
                inputNumber.append("1");
                break;
            }
            case R.id.buttonNumber2:{
                inputNumber.append("2");
                break;
            }
            case R.id.buttonNumber3:{
                inputNumber.append("3");
                break;
            }
            case R.id.buttonPlus:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign=Sign.plus;
                break;
            }
            case R.id.buttonEqual:{
                number2=Integer.parseInt(inputNumber.getText().toString());
                if(sign==Sign.plus){
                    result=number1+number2;
                }
                inputNumber.setText(String.valueOf(result));
                number1=result;
                break;
            }
        }
    }
}
