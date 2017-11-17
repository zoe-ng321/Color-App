package colors.com.color_app;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    final String blue= "#2d92e5";
    final String red="#d81c25";
    final String green="#16bc50";
    final String purple="#7f2ed1";
    final String yellow= "#f7f151";
    Integer count= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateColor(View view){
        ImageView rect=(ImageView)findViewById(R.id.rectimage);
        GradientDrawable bgShape = (GradientDrawable)rect.getDrawable();
        switch(count){
            case 0:
                bgShape.setColor(Color.GREEN);
                count++;
                System.out.println(count);
                break;
            case 1:
                bgShape.setColor(Color.MAGENTA);
                count++;
                System.out.println(count);
                break;
            case 2:
                bgShape.setColor(Color.YELLOW);
                count++;
                System.out.println(count);
                break;
            case 3:
                bgShape.setColor(Color.RED);
                count++;
                System.out.println(count);
                break;
            case 4:
                bgShape.setColor(Color.BLUE);
                count=0;
                System.out.println(count);
                break;
        }

    }
}
