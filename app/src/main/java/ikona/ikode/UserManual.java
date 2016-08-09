package ikona.ikode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UserManual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_manual);

        String url = "http://ikonasoftware.com/EN/user_manual.html";
        WebView webView = (WebView) findViewById(R.id.webUM);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
