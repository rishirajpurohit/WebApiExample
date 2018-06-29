package android.rishirajpurohit.in.webapiexample;

import com.google.gson.annotations.SerializedName;

/** Model of Tasks
 * Created by rishi on 29-06-2018.
 */


public class TaskPOJO {

    @SerializedName("task_name")
    public String task_name;

    @SerializedName("task_id")
    public String _id;

    @SerializedName("task_priority")
    public String priority;

    @SerializedName("task_body")
    public String body;

}
