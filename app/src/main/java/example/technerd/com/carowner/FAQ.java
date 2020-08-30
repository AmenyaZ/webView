package example.technerd.com.carowner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FAQ extends AppCompatActivity {
        WebView wbv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        wbv = findViewById(R.id.faqs);

//        wbv = (WebView) findViewById(R.id.contentWeb);
//        wbv.getSettings().setUseWideViewPort(true);
//        wbv.getSettings().setLoadWithOverviewMode(true);
//
//        wbv.getSettings().setSupportZoom(true);
//        wbv.getSettings().setBuiltInZoomControls(true);
//        wbv.getSettings().setDisplayZoomControls(false);


        wbv.loadUrl("http://www.parliament.go.ke/frequently-asked-questions");




    }
}
