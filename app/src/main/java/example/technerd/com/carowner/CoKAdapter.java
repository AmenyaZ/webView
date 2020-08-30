package example.technerd.com.carowner;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CoKAdapter extends RecyclerView.Adapter<CoKAdapter.ViewHolder>
{
    private ArrayList<CoK> coKS;

    itemClicked activity;

    public interface itemClicked
    {
        void onItemClicked(int index);
    }

    public CoKAdapter(Context context, ArrayList<CoK>list)
    {
        coKS =list;
        activity=(itemClicked) context;

    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivMake;
       /* LinearLayout ivMake;*/
        TextView tvChapter, tvChapterName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivMake=itemView.findViewById(R.id.ivImage);

            tvChapter=itemView.findViewById(R.id.tvChapter);
            tvChapterName=itemView.findViewById(R.id.tvChapterName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemClicked(coKS.indexOf((CoK) view.getTag()));

                }
            });
        }
    }


    @NonNull
    @Override
    public CoKAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout ,parent,false);
        return new ViewHolder(v);

    }




    @Override
    public void onBindViewHolder(@NonNull CoKAdapter.ViewHolder holder, int position) {

        holder.itemView.setTag(coKS.get(position));
        holder.tvChapter.setText(coKS.get(position).getChapter());
        holder.tvChapterName.setText(coKS.get(position).getChapterName());




        if (coKS.get(position).getBackground().equals("chapter01"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter1);
        }
       else if (coKS.get(position).getBackground().equals("chapter02"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter2);
        }
      else  if (coKS.get(position).getBackground().equals("chapter03"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter3);
        }
       else if (coKS.get(position).getBackground().equals("chapter04"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter4);
        }
       else if (coKS.get(position).getBackground().equals("chapter05"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter5);
        }
       else if (coKS.get(position).getBackground().equals("chapter06"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter7);
        }
       else if (coKS.get(position).getBackground().equals("chapter07"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter6);
        }
       else if (coKS.get(position).getBackground().equals("chapter08"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter8);
        }
       else if (coKS.get(position).getBackground().equals("chapter09"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter9);
        }
       else if (coKS.get(position).getBackground().equals("chapter10"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter10);
        }
       else if (coKS.get(position).getBackground().equals("chapter11"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter11);
        }
      else  if (coKS.get(position).getBackground().equals("chapter12"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter12);
        }
       else if (coKS.get(position).getBackground().equals("chapter13"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter13);
        }
       else if (coKS.get(position).getBackground().equals("chapter14"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter14);
        }
       else if (coKS.get(position).getBackground().equals("chapter15"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter15);
        }
       else if (coKS.get(position).getBackground().equals("chapter16"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter16);
        }
       else if (coKS.get(position).getBackground().equals("chapter17"))
        {
            holder.ivMake.setImageResource(R.drawable.chapter17);
        }
       else if (coKS.get(position).getBackground().equals("chapter18")) {
            holder.ivMake.setImageResource(R.drawable.chapter18);
        }
       else
           holder.ivMake.setImageResource(R.drawable.chpter1ii);


    }


    @Override
    public int getItemCount() {
        return coKS.size();
    }
}
