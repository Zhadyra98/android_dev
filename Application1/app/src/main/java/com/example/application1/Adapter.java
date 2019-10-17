package com.example.application1;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater inflater;
    private String[] sTitles;
    private String[] sContent;
    Adapter(Context context, String[] titles, String[] contents){
        this.inflater=LayoutInflater.from(context);
        this.sTitles = titles;
        this.sContent=contents;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.content_view, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        String title = sTitles[i];
        String content = sContent[i];
        holder.storyTitle.setText(title);
        holder.storyContent.setText(content);

    }
    @Override
    public int getItemCount() {
        return sTitles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView storyTitle, storyContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), Details.class);
                    i.putExtra("titleOfStory", sTitles[getAdapterPosition()]);
                    i.putExtra("contentOfStory" , sContent[getAdapterPosition()]);

                    v.getContext().startActivity(i);
                }
            });
            storyTitle=itemView.findViewById(R.id.storyTitle);
            storyContent=itemView.findViewById(R.id.storyContent);

        }
    }
}
