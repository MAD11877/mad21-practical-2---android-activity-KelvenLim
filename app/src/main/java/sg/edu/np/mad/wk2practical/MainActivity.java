package sg.edu.np.mad.wk2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tag = "button pressed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("john", "abc", 123, false);

        Button myFollowButton = findViewById(R.id.followButton);

        myFollowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView followText = findViewById(R.id.followButton);

                if (myUser.isFollowed() == false){
                    myUser.setFollowed(true);
                    followText.setText("Unfollow");
                }
                else{
                    myUser.setFollowed(false);
                    followText.setText("Follow");
                }

                Log.v(tag, String.valueOf(myUser.isFollowed()));
            }
        }
        );
    }
}