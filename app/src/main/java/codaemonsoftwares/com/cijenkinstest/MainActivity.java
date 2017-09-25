package codaemonsoftwares.com.cijenkinstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*Hello this is Android Workspace for CI jenkins Test*/

/**To trigger Build automatically on Jenkins when code is commited on Github repo need to follow below steps :
* 1.Install Plugin on jenkins - "github integration plugin"
* 2.Goto Project and configure >> Build Trigger >> check GitHub hook trigger for GITScm polling and save
* 3.Goto Github >> setting >> webhook >> add webhook >> add jenkins project URL and save.*/


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
