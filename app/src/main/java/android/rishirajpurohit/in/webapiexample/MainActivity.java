package android.rishirajpurohit.in.webapiexample;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApiInterface apiService = MyClient.getClient().create(MyApiInterface.class);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading");
        dialog.show();

        Call<TaskPOJO> taskPOJOCall = apiService.getTasks();
        taskPOJOCall.enqueue(new Callback<TaskPOJO>() {
            @Override
            public void onResponse(Call<TaskPOJO> call, Response<TaskPOJO> response) {
                TaskPOJO mytask = response.body();
                Toast.makeText(MainActivity.this, "Task is : "+mytask.task_name, Toast.LENGTH_SHORT).show();
                dialog.hide();
            }

            @Override
            public void onFailure(Call<TaskPOJO> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                dialog.hide();
            }
        });


    }
}
