package huuduan.sanpham.matongrung;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class MainDatHang extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dat_hang);
        webView = findViewById(R.id.idWebViewDH);

        webView.loadUrl("file:///android_asset/18matong.html");
    }
}