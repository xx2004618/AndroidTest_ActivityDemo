package xiangxiao.activitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xiangxiao on 2016/8/30.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_second);
    }
}
