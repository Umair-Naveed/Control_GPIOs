package butt07_group.butt07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AsyncResponse, View.OnClickListener {
    ToggleButton JButton;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JButton= findViewById(R.id.toggleButton);
        JButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(JButton.isChecked())
        {
            text= "ON";
        }
        else {
            text= "OFF";
        }
        try{
            HashMap data= new HashMap();
            data.put("Toggle",text);

            PostResponseAsyncTask task= new PostResponseAsyncTask((AsyncResponse) this,data);
            task.execute("http://192.168.1.10/ControlSwitches.php");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processFinish(String s) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT ).show();
    }
}
