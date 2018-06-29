package android.rishirajpurohit.in.webapiexample;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rishi on 29-06-2018.
 */

public interface MyApiInterface {

    @GET("getTasks")
    Call<TaskPOJO> getTasks();

}
