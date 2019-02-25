package om.banat.karawan.karawanmyfinalapplication2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ShowAllTasksActivity extends AppCompatActivity {
     private ListView lvTasks;
     private TaskAdopter taskAdopter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_tasks);

    }
}
