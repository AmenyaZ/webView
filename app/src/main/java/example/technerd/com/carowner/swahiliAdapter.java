package example.technerd.com.carowner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class swahiliAdapter extends RecyclerView.Adapter<swahiliAdapter.ViewHolder>{

    private ArrayList<KyK> kyKS;
    itemsClicked activityN;








    public  interface  itemsClicked{
        void onItemsClicked(int index);
    }

    public swahiliAdapter(Context mcontext,ArrayList<KyK>list1){
        kyKS = list1;
        activityN=(itemsClicked) mcontext;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView ivPicha;
        TextView  tvSura,tvJinaSura;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPicha = itemView.findViewById(R.id.ivPicha);
            tvSura=itemView.findViewById(R.id.tvSura);
            tvJinaSura=itemView.findViewById(R.id.tvJinaSura);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activityN.onItemsClicked(kyKS.indexOf((KyK) view.getTag()));
                }
            });
        }
    }
    @NonNull
    @Override
    public swahiliAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_swahili_layout ,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemView.setTag(kyKS.get(position));
        holder.tvSura.setText(kyKS.get(position).getSura());
        holder.tvJinaSura.setText(kyKS.get(position).getJina_la_sura());




        if (kyKS.get(position).getPazia_nyuma().equals("chapter01"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter1);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter02"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter2);
        }
        else  if (kyKS.get(position).getPazia_nyuma().equals("chapter03"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter3);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter04"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter4);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter05"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter5);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter06"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter7);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter07"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter6);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter08"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter8);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter09"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter9);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter10"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter10);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter11"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter11);
        }
        else  if (kyKS.get(position).getPazia_nyuma().equals("chapter12"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter12);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter13"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter13);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter14"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter14);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter15"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter15);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter16"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter16);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter17"))
        {
            holder.ivPicha.setImageResource(R.drawable.chapter17);
        }
        else if (kyKS.get(position).getPazia_nyuma().equals("chapter18")) {
            holder.ivPicha.setImageResource(R.drawable.chapter18);
        }
        else
            holder.ivPicha.setImageResource(R.drawable.chpter1ii);


    }
    @Override
    public int getItemCount() {
        return kyKS.size();
    }






}
