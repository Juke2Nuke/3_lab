package com.example.a3_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView input;
    private TextView pendingActions;
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnDelOne;
    private Button btnClrAll;
    private Button btnEquals;
    private Button btnPower;
    private Button btnPlus;
    private Button btnMultiply;
    private Button btnMinus;
    private Button btnPercent;
    private Button btnInverse;
    private Button btnClrInput;
    private Button btnDivide;
    private Button btnDot;
    private Button btnRoot;
    private Button btnChangeSign;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.input = findViewById(R.id.input);
        this.pendingActions = findViewById(R.id.pendingActions);
        this.btnZero = findViewById(R.id.btnZero);
        this.btnOne = findViewById(R.id.btnOne);
        this.btnTwo = findViewById(R.id.btnTwo);
        this.btnThree = findViewById(R.id.btnThree);
        this.btnFour = findViewById(R.id.btnFour);
        this.btnFive = findViewById(R.id.btnFive);
        this.btnSix = findViewById(R.id.btnSix);
        this.btnSeven = findViewById(R.id.btnSeven);
        this.btnEight = findViewById(R.id.btnEight);
        this.btnNine = findViewById(R.id.btnNine);
        this.btnDelOne = findViewById(R.id.btnDelOne);
        this.btnClrAll = findViewById(R.id.btnClrAll);
        this.btnEquals = findViewById(R.id.btnEquals);
        this.btnPower = findViewById(R.id.btnPower);
        this.btnPlus = findViewById(R.id.btnPlus);
        this.btnMultiply = findViewById(R.id.btnMultiply);
        this.btnMinus = findViewById(R.id.btnMinus);
        this.btnPercent = findViewById(R.id.btnPercent);
        this.btnInverse = findViewById(R.id.btnInverse);
        this.btnClrInput = findViewById(R.id.btnClrInput);
        this.btnDivide = findViewById(R.id.btnDivide);
        this.btnDot = findViewById(R.id.btnDot);
        this.btnRoot = findViewById(R.id.btnRoot);
        this.btnChangeSign = findViewById(R.id.btnChangeSign);
    }
    double solution=0;
    public void btnInverseOnClick(View view) {

    }

    public void btnDelOneOnClick(View view) {
    }

    public void btnClrAllOnClick(View view) {
    }

    public void btnClrInputOnClick(View view) {
    }

    public void btnEqualsOnClick(View view) {
        if(pendingActions.getText().toString().substring(pendingActions.getText().toString().length() - 1).equals("+"))
        {
            solution = solution + Double.parseDouble(input.getText().toString());
            pendingActions.append(input.getText()+"=");
        }
        else if (pendingActions.getText().toString().substring(pendingActions.getText().toString().length() - 1).equals("-"))
        {
            solution = solution - Double.parseDouble(input.getText().toString());
            pendingActions.append(input.getText()+"=");
        }
        else if (pendingActions.getText().toString().substring(pendingActions.getText().toString().length() - 1).equals("*"))
        {
            solution = solution * Double.parseDouble(input.getText().toString());
            pendingActions.append(input.getText()+"=");
        }
        else if (pendingActions.getText().toString().substring(pendingActions.getText().toString().length() - 1).equals("/"))
        {
            solution = solution / Double.parseDouble(input.getText().toString());
            pendingActions.append(input.getText()+"=");
        }
        if(solution == (int)solution)input.setText(Integer.toString((int)solution));
        else input.setText(Double.toString(solution));
    }

    public void btnSixOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("6");
    }

    public void btnPowerOnClick(View view) {
    }

    public void btnSevenOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("7");
    }

    public void btnPlusOnClick(View view) {
        if(solution==0)
        {
            solution = Double.parseDouble(input.getText().toString());
        }
        else
        {
            solution = solution + Double.parseDouble(input.getText().toString());
        }
        pendingActions.append(input.getText()+"+");
        input.setText("");
    }

    public void btnMultiplyOnClick(View view) {
        if(solution==0)
        {
            solution = Double.parseDouble(input.getText().toString());

        }
        else
        {
            solution = solution * Double.parseDouble(input.getText().toString());
        }
        pendingActions.append(input.getText()+"*");
        input.setText("");
    }

    public void btnMinusOnClick(View view) {
        if(solution==0)
        {
            solution = Double.parseDouble(input.getText().toString());
        }
        else
        {
            solution = solution - Double.parseDouble(input.getText().toString());
        }
        pendingActions.append(input.getText()+"-");
        input.setText("");
    }

    public void btnOneOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("1");
    }

    public void btnThreeOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("3");
    }

    public void btnPercentOnClick(View view) {
    }

    public void btnNineOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("9");
    }

    public void btnZeroOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("0");
    }

    public void btnFiveOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("5");
    }

    public void btnDivideOnClick(View view) {
        if(solution==0)
        {
            solution = Double.parseDouble(input.getText().toString());
        }
        else
        {

            solution = solution / Double.parseDouble(input.getText().toString());
        }

        pendingActions.append(input.getText()+"/");
        input.setText("");
    }

    public void btnEightOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("8");
    }

    public void btnFourOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("4");
    }

    public void btnTwoOnClick(View view) {
        if (input.getText().equals("0")){
            input.setText("");
        }
        input.append("2");
    }

    public void btnDotOnClick(View view) {
        input.append(".");
    }

    public void btnRootOnClick(View view) {
    }

    public void btnChangeSignOnClick(View view) {
    }
}