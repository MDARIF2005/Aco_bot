package com.example.aco_bot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends  RecyclerView.Adapter<MessageAdapter.MyViewHolder>{

    List<Message> messageList;
    public MessageAdapter(List<Message> messagelist) {

        this.messageList=messagelist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(chatView);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Message message=messageList.get(position);
        if(message.getSentby().equals(Message.Sent_by_me)){
            holder.leftchatView.setVisibility(View.GONE);
            holder.RightchatView.setVisibility(View.VISIBLE);
            holder.rightTextView.setText(message.getMessage());
        }
        else{
            holder.RightchatView.setVisibility(View.GONE);
            holder.leftchatView.setVisibility(View.VISIBLE);
            holder.leftTextView.setText(message.getMessage());

        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        LinearLayout leftchatView ,RightchatView;
        TextView leftTextView,rightTextView;


        public MyViewHolder(View itemView){
            super(itemView);
            leftchatView=itemView.findViewById(R.id.left_chat_view);
            RightchatView=itemView.findViewById(R.id.right_chat_view);
            leftTextView=itemView.findViewById(R.id.left_chat_text_view);
            rightTextView=itemView.findViewById(R.id.right_chat_text_view);
        }
    }
}