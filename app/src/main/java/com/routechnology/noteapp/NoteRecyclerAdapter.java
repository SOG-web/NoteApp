/*
 * Copyright (c) 2021. This is a property of ROU Technology and you should not in anyway do anything illegal with it or to it as define by ROU Technology. If you would like to do anything with it kindly contact us at support@routechnology.tech
 */

package com.routechnology.noteapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder> {

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    private final List<NoteInfo> mNotes;

    public NoteRecyclerAdapter(Context context, List<NoteInfo> notes) {
        mContext = context;
        mNotes = notes;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mLayoutInflater.inflate(R.layout.item_note_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        NoteInfo note = mNotes.get(position);
        holder.mTextCourse.setText(note.getCourse().getTitle());
        holder.mTextTitle.setText(note.getTitle());
        holder.mCurrentPosition = position;

    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView mTextCourse;
        public final TextView mTextTitle;
        public int mCurrentPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextCourse = (TextView) itemView.findViewById(R.id.text_course);
            mTextTitle = (TextView) itemView.findViewById(R.id.text_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, NoteActivity.class);
                    intent.putExtra(NoteActivity.NOTE_POSITION, mCurrentPosition);
                    mContext.startActivity(intent);
                }
            });
        }
    }


}
