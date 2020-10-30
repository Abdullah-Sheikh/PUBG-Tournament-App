package com.comptech.login.pubgtournament;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.comptech.login.pubgtournament.RecyclerViewAdapter.*;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MatchViewHolder>{
    private String [] map;
    private String[] title,date,match_type,fess,kill_amount,prize,joining;
    public RecyclerViewAdapter(String[] map,String[]title,String[] date, String[] match_type, String[] fees, String[] kill_amount,String[] prize,String[] joining ) {
        this.map=map;
        this.date=date;
        this.match_type = match_type;
        this.fess = fees;
        this.kill_amount = kill_amount;
        this.prize = prize;
        this.joining = joining;
        this.title = title;

    }
    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.matches,viewGroup,false );
        MatchViewHolder matchViewHolder = new MatchViewHolder(view);
        return matchViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder viewHolder, int i) {
        String check_map=map[i];
        if(check_map.contains("Erangel") )
        {
            viewHolder.map.setImageResource(R.drawable.erangel);
        }
        else if (check_map.contains("Miramar") )
        {
            viewHolder.map.setImageResource(R.drawable.miramar);
        }
        else if (check_map.contains("Sanhok") )
        {
            viewHolder.map.setImageResource(R.drawable.sanhok);
        }
        else
        {
            viewHolder.map.setImageResource(R.drawable.vikendi);
        }

        viewHolder.match_title.setText(title[i]);
        viewHolder.Fees.setText(fess[i]);
        viewHolder.Kill_amount.setText(kill_amount[i]);
        viewHolder.prize.setText(prize[i]);
        viewHolder.Date.setText(date[i]);
        viewHolder.Match_type.setText(match_type[i]);
        viewHolder.joining.setText(joining[i]+"/100");
        viewHolder.join.setProgress(Integer.parseInt(joining[i]) );

    }

    @Override
    public int getItemCount() {
        return map.length;
    }

    public static class MatchViewHolder extends RecyclerView.ViewHolder {
        ImageView map;
        TextView match_title,Date,Match_type,Fees,Kill_amount,prize,joining;
        ProgressBar join;


        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);
            map= itemView.findViewById(R.id.map);
            match_title=itemView.findViewById(R.id.match_title);
            Fees=itemView.findViewById(R.id.entryfee);
            Kill_amount =itemView.findViewById(R.id.killamount);
            prize=itemView.findViewById(R.id.prize);
            Date=itemView.findViewById(R.id.date);
            Match_type = itemView.findViewById(R.id.match_type);
            joining =itemView.findViewById(R.id.joining);
            join =itemView.findViewById(R.id.joining_bar);

        }
    }
}