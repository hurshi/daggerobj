package io.github.hurshi.daggerobj;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    private void test() {
        Test test = new Test();
        Log.e(">>>", ">>> test: " + test.toString());
    }
}
