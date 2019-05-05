package om.banat.karawan.karawanmyfinalapplication2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    protected void onResume() {
        MyThread myTared = new MyThread();
        myTared.start();
        super.onResume();
    }

    public class MyThread extends Thread
    {
        @Override
        public void run() {
            try {
                sleep(3000);
                Intent i  = new Intent(getApplicationContext(), LoginActivity2.class);
                startActivity(i);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}



