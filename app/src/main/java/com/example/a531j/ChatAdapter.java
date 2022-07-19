package com.example.a531j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ChatAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Chat> items;

    public ChatAdapter(ArrayList<Chat> items, Context context){
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new MessageViewHolder(view);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chat chat = items.get(position);

        if(holder instanceof  MessageViewHolder){
            ShapeableImageView shapeableImageView = ((MessageViewHolder)holder).iv_profile;
            TextView textView = ((MessageViewHolder)holder).tv_fullname;

            shapeableImageView.setImageResource(chat.profile);

            textView.setText(chat.fullname);

        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_profile = itemView.findViewById(R.id.iv_profile);
            tv_fullname = itemView.findViewById(R.id.fullname);

        }
    }
}

