package com.example.aceonapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class jobRVAdapter extends RecyclerView.Adapter<jobRVAdapter.ViewHolder>{

        private ArrayList<JobModal> jobModalArrayList;
        private Context context;

        public jobRVAdapter(ArrayList<JobModal> jobModalArrayList, Context context) {
            this.jobModalArrayList = jobModalArrayList;
            this.context = context;
        }

        @NonNull
        @Override
        public jobRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_rv_item, parent, false);
            return new jobRVAdapter.ViewHolder(view);
        }


    @Override
        public void onBindViewHolder(@NonNull jobRVAdapter.ViewHolder holder, int position) {
            JobModal modal = jobModalArrayList.get(position);
            holder.jobNameTV.setText(modal.getjobName());
            holder.jobEmailTV.setText(modal.getjobEmail());
        }

        @Override
        public int getItemCount() {
            return jobModalArrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            private TextView jobNameTV, jobEmailTV;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                jobNameTV = itemView.findViewById(R.id.name);
                jobEmailTV = itemView.findViewById(R.id.email);

            }
        }
    }
