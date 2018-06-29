package android.rishirajpurohit.in.webapiexample;

import retrofit2.Call;
import retrofit2.http.GET;
//https://www.mockable.io
//https://www.androidhive.info/2016/05/android-working-with-retrofit-http-library/
/**
 * Created by rishi on 29-06-2018.
 */

public interface MyApiInterface {

    @GET("getTasks")
    Call<TaskPOJO> getTasks();

}
