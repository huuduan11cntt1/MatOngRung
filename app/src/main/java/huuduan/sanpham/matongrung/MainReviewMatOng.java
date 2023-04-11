package huuduan.sanpham.matongrung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainReviewMatOng extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_review_mat_ong);
        webView = findViewById(R.id.idWebView);

        webView.loadUrl("file:///android_asset/test.html");
    }
}