package huuduan.sanpham.matongrung;


import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import com.ramotion.circlemenu.CircleMenuView;

import huuduan.sanpham.matongrung.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); ;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener(){
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationStart");
            }
            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationEnd");
            }
            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationStart");
            }
            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationEnd");
            }


            // Click Button
            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                //Log.d("D","onButtonClickAnimationStart|index: "+index);
                if(index==0){
                    startActivity(new Intent(MainActivity.this,MainReviewMatOng.class));

                } if(index==1){
                     startActivity(new Intent(MainActivity.this,MainDatHang.class));

                } if(index==2){
                    String url = "https://www.facebook.com/huuduanplus";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);

                } if(index==3){
                    // startActivity(new Intent(MainActivity.this,MainActivity5.class));

                } if(index==4){
               //     startActivity(new Intent(MainActivityCicle.this,MainGioiThieuApp.class));
                    String url = "https://www.facebook.com/huuduanplus";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }

            }
            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {


            }
            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int buttonIndex) {
                // Log.d("D","onButtonLongClick|index: "+buttonIndex);
                return false;

            }
            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int buttonIndex) {
                // Log.d("D","onButtonLongClickAnimationStart|index: "+buttonIndex);


            }
            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int index) {


            }
        });

    }


}