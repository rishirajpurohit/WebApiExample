package android.rishirajpurohit.in.webapiexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TaskPOJO taskPOJO = (TaskPOJO) getIntent().getSerializableExtra("task");
        Toast.makeText(this, "Name is "+taskPOJO.task_name, Toast.LENGTH_SHORT).show();

    }
}
