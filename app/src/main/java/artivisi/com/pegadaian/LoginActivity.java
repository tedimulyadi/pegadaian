package artivisi.com.pegadaian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by teddy on 20/04/16.
 */
public class LoginActivity extends AppCompatActivity{

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void btnLogin(View view){
        startActivity(new Intent("artivisi.com.DashboardActivity"));
    }
}
