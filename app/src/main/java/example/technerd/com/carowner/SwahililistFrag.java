package example.technerd.com.carowner;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SwahililistFrag extends Fragment {
    RecyclerView recyclerView1;
    RecyclerView.Adapter myAdapter1;
    RecyclerView.LayoutManager layoutManager1;
    View view1;


    public SwahililistFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view1=(inflater.inflate(R.layout.fragment_swahililist, container, false));
        return view1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView1=view1.findViewById(R.id.list1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(layoutManager1);

        layoutManager1=new LinearLayoutManager(SwahililistFrag.this.getActivity());
        recyclerView1.setLayoutManager(layoutManager1);

        myAdapter1=new swahiliAdapter(SwahililistFrag.this.getActivity(),SwahiliAppClass.kyKS);
        recyclerView1.setAdapter(myAdapter1);
    }
}
