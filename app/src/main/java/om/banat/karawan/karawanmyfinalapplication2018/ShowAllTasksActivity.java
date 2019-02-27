package om.banat.karawan.karawanmyfinalapplication2018;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class ShowAllTasksActivity extends AppCompatActivity {
    private ListView lvTasks;
    private TaskAdopter taskAdopter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_tasks);
        lvTasks=findViewById(R.id.lstvTasks);
        taskAdopter=new TaskAdopter(getBaseContext(),R.layout.taskitem);
        lvTasks.setAdapter(taskAdopter);
        readTasks();
    }
  private void readTasks(){
      Database
  }

    }



