package artivisi.com.pegadaian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
    }

    public void loginOnClick (View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Login", Toast.LENGTH_LONG);
        toast.show();
    }
}