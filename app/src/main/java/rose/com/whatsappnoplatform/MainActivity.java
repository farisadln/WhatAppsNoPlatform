package rose.com.whatsappnoplatform;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public EditText addnumber ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addnumber = findViewById(R.id.addNumber);


    }

    public void openNumber(View view){
        String content = addnumber.getText().toString();
        String number = "https://wa.me/"+content;
        Intent webIntent = new Intent(Intent.ACTION_VIEW ,Uri.parse(number));
        startActivity(webIntent);
        addnumber.getText().clear();
    }
}
