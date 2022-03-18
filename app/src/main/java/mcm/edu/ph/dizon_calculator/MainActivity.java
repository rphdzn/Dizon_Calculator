package mcm.edu.ph.dizon_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText Var1, Var2;
    Button add, subtract, multiply, divide, percent;
    TextView result;

    double Vari1, Vari2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.Addition);
        subtract = findViewById(R.id.Subtraction);
        multiply = findViewById(R.id.Multiplication);
        divide = findViewById(R.id.Division);
        percent = findViewById(R.id.Percentage);

        result = findViewById(R.id.Answer);

        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        percent.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Var1 = findViewById(R.id.Variable1);
        Var2 = findViewById(R.id.Variable2);

        Vari1 = Double.parseDouble(Var1.getText().toString());
        Vari2 = Double.parseDouble(Var2.getText().toString());
        switch (view.getId()){
            case R.id.Addition:
                result.setText(Double.toString(Vari1+Vari2));
                break;
            case R.id.Subtraction:
                result.setText(Double.toString(Vari1-Vari2));
                break;
            case R.id.Multiplication:
                result.setText(Double.toString(Vari1*Vari2));
                break;
            case R.id.Division:
                result.setText(Double.toString(Vari1/Vari2));
                break;
            case R.id.Percentage:
                result.setText(Double.toString(Vari1%Vari2));
                break;
        }
    }
}