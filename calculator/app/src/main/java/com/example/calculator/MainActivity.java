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
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;
    private Button buttonC;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private Button buttonEqual;
    private Button buttonSign;
    private Button buttonComa;
    private Button buttonParenthesis;
    private Button buttonProc;

    private int number1;
    private int number2;
    private int result;
    private boolean p;
    enum Sign{
        plus, minus, mul, div, sqrt, proc
    }
    private Sign sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNumber=findViewById(R.id.numberInput);
        p=false;
        buttonNumber1=findViewById(R.id.buttonNumber1);
        buttonNumber2=findViewById(R.id.buttonNumber2);
        buttonNumber3=findViewById(R.id.buttonNumber3);
        buttonNumber4=findViewById(R.id.buttonNumber4);
        buttonNumber5=findViewById(R.id.buttonNumber5);
        buttonNumber6=findViewById(R.id.buttonNumber6);
        buttonNumber7=findViewById(R.id.buttonNumber7);
        buttonNumber8=findViewById(R.id.buttonNumber8);
        buttonNumber9=findViewById(R.id.buttonNumber9);
        buttonNumber0=findViewById(R.id.buttonNumber0);
        buttonC=findViewById(R.id.buttonC);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonMinus=findViewById(R.id.buttonMinus);
        buttonDivide=findViewById(R.id.buttonDivide);
        buttonMultiply=findViewById(R.id.buttonMultiply);
        buttonEqual=findViewById(R.id.buttonEqual);
        buttonSign=findViewById(R.id.buttonSign);
        buttonComa=findViewById(R.id.buttonComa);
        buttonParenthesis=findViewById(R.id.buttonParenthesis);
        buttonProc=findViewById(R.id.buttonProc);

        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonNumber4.setOnClickListener(this);
        buttonNumber5.setOnClickListener(this);
        buttonNumber6.setOnClickListener(this);
        buttonNumber7.setOnClickListener(this);
        buttonNumber8.setOnClickListener(this);
        buttonNumber9.setOnClickListener(this);
        buttonNumber0.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonSign.setOnClickListener(this);
        buttonComa.setOnClickListener(this);
        buttonProc.setOnClickListener(this);
        buttonParenthesis.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
            case R.id.buttonC:{
                inputNumber.setText("");
                break;
            }
            case R.id.buttonParenthesis:{
                if(!p){
                    number1=Integer.parseInt(inputNumber.getText().toString());
                    inputNumber.setText("("+number1);
                }
                else{
                    inputNumber.append(")");
                }
                p=true;
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
            case R.id.buttonNumber4:{
                inputNumber.append("4");
                break;
            }
            case R.id.buttonNumber5:{
                inputNumber.append("5");
                break;
            }
            case R.id.buttonNumber6:{
                inputNumber.append("6");
                break;
            }
            case R.id.buttonNumber7:{
                inputNumber.append("7");
                break;
            }
            case R.id.buttonNumber8:{
                inputNumber.append("8");
                break;
            }
            case R.id.buttonNumber9:{
                inputNumber.append("9");
                break;
            }
            case R.id.buttonNumber0:{
                inputNumber.append("0");
                break;
            }
            case R.id.buttonPlus:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign=Sign.plus;
                break;
            }
            case R.id.buttonMinus:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign=Sign.minus;
                break;
            }
            case R.id.buttonMultiply:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign=Sign.mul;
                break;
            }
            case R.id.buttonDivide:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign=Sign.div;
                break;
            }
            case R.id.buttonProc:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign=Sign.proc;
                break;
            }
            case R.id.buttonEqual:{
                number2=Integer.parseInt(inputNumber.getText().toString());
                if(sign==Sign.plus){
                    result=number1+number2;
                }
                if(sign==Sign.minus){
                    result=number1-number2;
                }
                if(sign==Sign.mul){
                    result=number1*number2;
                }
                if(sign==Sign.div){
                    result=number1/number2;
                }
                if(sign==Sign.proc){
                    result=(number1*number2)/100;
                }
                inputNumber.setText(String.valueOf(result));
                number1=result;
                break;
            }
            case R.id.buttonSign:{
                number1=Integer.parseInt(inputNumber.getText().toString());
                number1=number1*(-1);
                inputNumber.setText(String.valueOf(number1));
                break;
            }
            case R.id.buttonComa:{
                inputNumber.append(",");
                break;
            }
        }
    }
}
