package com.paradogs.mosparty.view_holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.paradogs.mosparty.R;
import com.paradogs.mosparty.interfaces.ItemClickListener;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductTitle, txtProductOldPrice, txtProductPrice;
    public ImageView image;
    public ItemClickListener listener;

    public ProductViewHolder(View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.product_image);
        txtProductTitle = itemView.findViewById(R.id.product_title);
        txtProductOldPrice = itemView.findViewById(R.id.product_oldPrice);
        txtProductPrice = itemView.findViewById(R.id.product_price);
    }

    public void setItemClickListener(ItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition(), false);
    }
}
