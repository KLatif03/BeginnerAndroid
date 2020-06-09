package com.dicoding.picodiploma.mysubmissionap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.mysubmissionap.Food;
import com.dicoding.picodiploma.mysubmissionap.R;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {
    private ArrayList<Food> listFood;

    private ItemClickCallback itemClickCallback ;
    public ListFoodAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_food,viewGroup,false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.imgPhoto);
        holder.tvName.setText(food.getName());
        holder.tvDetail.setText(food.getDetail());

    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }

    public interface ItemClickCallback {
        void onItemCallClicked (String title);
    }
}