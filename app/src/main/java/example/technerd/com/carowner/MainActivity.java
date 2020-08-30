package example.technerd.com.carowner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CoKAdapter.itemClicked {


    final  static  float STEP = 30;
    float mRatio = 1.0f;
    int mBaseDistance;
    float mBaseRatio;
    float fontSize = 13;

    ImageView ivMake;
    TextView tvChapter, tvChapterName, tvContent;
    WebView contentWeb;
    FragmentManager fragmentManager;
    Fragment  ownerInfoFrag, listFrag;

    private ArrayList<CoK> coKS;
    private static  final String TAG ="MainActivity";
    private Context mContext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        contentWeb = (WebView) findViewById(R.id.contentWeb);
        contentWeb.getSettings().setUseWideViewPort(true);
        contentWeb.getSettings().setLoadWithOverviewMode(true);

        contentWeb.getSettings().setSupportZoom(true);
        contentWeb.getSettings().setBuiltInZoomControls(true);
        contentWeb.getSettings().setDisplayZoomControls(false);


        /*refreshWebView(contentWeb);*/
       /* mContext = MainActivity.this;
        coKS = new ArrayList<CoK>();*/


        /*tvChapter=findViewById(R.id.tvChapter);
        tvChapterName=findViewById(R.id.tvChapterName);
        tvContent=findViewById(R.id.tvContent);

        tvContent.setMovementMethod(new ScrollingMovementMethod());
        tvContent.setTextIsSelectable(true);
        tvContent.setTextSize(mRatio + 13);*/



       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tvContent.setText(Html.fromHtml(String.valueOf(ApplicationClass.coKS), Html.FROM_HTML_MODE_LEGACY));
        } else
            tvContent.setText(Html.fromHtml(String.valueOf(ApplicationClass.coKS)));*/



        if (findViewById(R.id.layout_portrait) !=null)
        {

        }




        fragmentManager=getSupportFragmentManager();
        listFrag=fragmentManager.findFragmentById(R.id.listFrag);
        ownerInfoFrag=fragmentManager.findFragmentById(R.id.ownerInfoFrag);

        fragmentManager.beginTransaction()
                .show(listFrag)
                .hide(ownerInfoFrag)
                .commit();

        if (findViewById(R.id.layout_portrait)!=null){
            FragmentManager manager =this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(listFrag)
                    .hide(ownerInfoFrag)
                    .commit();
        }
        if (findViewById(R.id.layout_land)!=null)
            {
                FragmentManager manager =this.getSupportFragmentManager();
                manager.beginTransaction()
                        .show(listFrag)
                        .show(ownerInfoFrag)
                        .commit();
            }

        if (MainActivity.this.findViewById(R.id.layout_land) != null)

        {
            onItemClicked(0);

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.res_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.faq){
            Intent intent = new Intent(getApplicationContext(), FAQ.class);
            startActivity(intent);


            Toast.makeText(mContext, "Loading...", Toast.LENGTH_SHORT).show();

        }
        if (item.getItemId() == R.id.settings){
            Toast.makeText(mContext, "Coming Soon", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.swahili){
            Intent intent = new Intent(getApplicationContext(), SwahiliMainActivity.class);
            startActivity(intent);

           // Toast.makeText(mContext, "Loading...", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.home){
            Toast.makeText(mContext, "Coming Soon", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    //    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getPointerCount() == 2) {
//            int action = event.getAction();
//            int pureaction = action & MotionEvent.ACTION_MASK;
//            if (pureaction == MotionEvent.ACTION_POINTER_DOWN) {
//                mBaseDistance = getDistance(event);
//                mBaseRatio = mRatio;
//            } else {
//                float delta = (getDistance(event) - mBaseDistance) / STEP;
//                float multi = (float) Math.pow(2, delta);
//                mRatio = Math.min(1024.0f, Math.max(0.1f, mBaseRatio * multi));
//                tvContent.setTextSize(mRatio + 13);
//            }
//        }
//        return true;
//    }
//    int getDistance(MotionEvent event) {
//        int dx = (int) (event.getX(0) - event.getX(1));
//        int dy = (int) (event.getY(0) - event.getY(1));
//        return (int) (Math.sqrt(dx * dx + dy * dy));
//    }
//    public boolean onTouch(View v, MotionEvent event) {
//        return false;
//    }



    @Override
    public void onItemClicked(int index) {

       /* Log.d(TAG,"onCreate: "+data);*/

        /*String url = "file:///android_asset/"+databaseList()+".html";*/

        contentWeb.loadUrl(ApplicationClass.coKS.get(index).getUrl());
        /*setContentView(contentWeb);*/
//        tvChapter.setText(ApplicationClass.coKS.get(index).getChapter());
//        tvChapterName.setText(ApplicationClass.coKS.get(index).getChapterName());
//        tvContent.setText(ApplicationClass.coKS.get(index).getContent());

      /*  if (ApplicationClass.cars.get(index).getMake().equals("volkswagen"))
        {
            ivMake.setImageResource(R.drawable.volkswagen);

        }
        else if (ApplicationClass.cars.get(index).getMake().equals("nissan"))
        {
            ivMake.setImageResource(R.drawable.nissan);

        }
        else
        {
            ivMake.setImageResource(R.drawable.mercedes);

        }*/


        if (findViewById(R.id.layout_portrait) !=null)
        {
            FragmentManager manager =this.getSupportFragmentManager();
            manager.beginTransaction()
                    .hide(listFrag)
                    .show(ownerInfoFrag)
                    .addToBackStack(null)
                    .commit();

        }
      /*  else if (findViewById(R.id.layout_portrait) !=null)
        {
            FragmentManager manager =this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(listFrag)
                    .hide(buttonFrag)
                    .hide(carInfoFrag)
                    .hide(ownerInfoFrag)
                    .commit();


        }
       */

    }

    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listView = (ListView) getView().findViewById(R.id.listview);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return false;
                // this is textview which you used in listview row
                TextView textView = (TextView) view.findViewById(R.id.textview);
                ClipboardManager cm = (ClipboardManager) context
                        .getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(textView.getText().toString());
            }
        });

    }*/


}
