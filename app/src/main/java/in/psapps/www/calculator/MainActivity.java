package in.psapps.www.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static int io,lhs,rhs,result,countFlag=0;
    EditText editText=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        io=lhs=rhs=result=0;
        editText = (EditText) findViewById(R.id.edittext);
    }

    public void onClick(View view){

        String buttonPressed = ((Button) view).getText().toString();

        //NumberButtons
        if (view.getId()==R.id.zero){
            editText.append(buttonPressed);
            lhs=10*lhs +0;

        }
        if (view.getId()==R.id.one){
            editText.append(Integer.toString(1));
            io=10*io +1;
        }
        if (view.getId()==R.id.two){
            editText.append(Integer.toString(2));
            io=10*io +2;
        }

        //OperatorButtons
        if (view.getId()==R.id.plus){
            Log.d("PS", String.valueOf(lhs));


        }

        if (view.getId()==R.id.equal){
            EditText editText = (EditText) findViewById(R.id.edittext);
            editText.setText(Integer.toString(io));
        }
    }
}
