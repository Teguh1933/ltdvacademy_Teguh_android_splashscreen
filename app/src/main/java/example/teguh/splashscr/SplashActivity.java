package example.teguh.splashscr;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager ;

import example.teguh.splashscr.R;


public class SplashActivity extends Activity {

    //Set waktu lama splashscreen
    private static int splashInterval = 2000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Mengeset Tampilan Menjadi Full Screen
            requestWindowFeature(Window.FEATURE_NO_TITLE);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

            setContentView(R.layout.splash_main);
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    Intent i = new Intent(SplashActivity.this,
                            MainActivity.class);
                    startActivity(i);

                    //selesai Splashscreen
                    this.finish();
                }
                private void finish() {
                // TODO Auto-generated method stub
                }
            }, splashInterval);
        };

}