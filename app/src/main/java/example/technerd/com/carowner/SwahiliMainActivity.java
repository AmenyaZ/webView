package example.technerd.com.carowner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.webkit.WebView;

import java.util.ArrayList;

public class SwahiliMainActivity extends AppCompatActivity implements swahiliAdapter.itemsClicked {

    WebView swahilicontentWeb;
    FragmentManager fragmentManager;
    Fragment swahiliOwnerFrag, SwahililistFrag;
    /*private ArrayList<KyK> kyKS;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swahili_main);

        swahilicontentWeb = (WebView) findViewById(R.id.swahilicontentWeb);
//        swahilicontentWeb.getSettings().setUseWideViewPort(true);
//        swahilicontentWeb.getSettings().setLoadWithOverviewMode(true);

        /*swahilicontentWeb.getSettings().setSupportZoom(true);
        swahilicontentWeb.getSettings().setBuiltInZoomControls(true);
        swahilicontentWeb.getSettings().setDisplayZoomControls(false);*/

        if (findViewById(R.id.layout_portrait1) !=null)
        {

        }




        fragmentManager=getSupportFragmentManager();
        SwahililistFrag=fragmentManager.findFragmentById(R.id.SwahililistFrag);
        swahiliOwnerFrag=fragmentManager.findFragmentById(R.id.swahiliOwnerFrag);

        fragmentManager.beginTransaction()
                .show(SwahililistFrag)
                .hide(swahiliOwnerFrag)
                .commit();

        if (findViewById(R.id.layout_portrait1)!=null){
            FragmentManager manager =SwahiliMainActivity.this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(SwahililistFrag)
                    .hide(swahiliOwnerFrag)
                    .commit();
        }
        if (findViewById(R.id.layout_land1)!=null)
        {
            FragmentManager manager =SwahiliMainActivity.this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(SwahililistFrag)
                    .show(swahiliOwnerFrag)
                    .commit();
        }

        if (SwahiliMainActivity.this.findViewById(R.id.layout_land1) != null)

        {
            onItemsClicked(0);

        }
    }

    @Override
    public void onItemsClicked(int index) {

        swahilicontentWeb.loadUrl(SwahiliAppClass.kyKS.get(index).getLinki());

        if (findViewById(R.id.layout_portrait1) !=null)
        {
            FragmentManager manager =this.getSupportFragmentManager();
            manager.beginTransaction()
                    .hide(SwahililistFrag)
                    .show(swahiliOwnerFrag)
                    .addToBackStack(null)
                    .commit();

        }
    }
}
