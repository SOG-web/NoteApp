/*
 * Copyright (c) 2021. This is a property of ROU Technology and you should not in anyway do anything illegal with it or to it as define by ROU Technology. If you would like to do anything with it kindly contact us at support@routechnology.tech
 */

package com.routechnology.noteapp;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.routechnology.noteapp.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.routechnology.noteapp.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "com.routechnology.noteapp.ORIGINAL_NOTE_TEXT";


    public String mOriginalNoteCourseId;
    public String mOriginalNoteTitle;
    public String mOriginalNoteText;
    public  boolean mIsNewlyCreated = true;




    public void saveState(Bundle outstate) {
        outstate.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outstate.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outstate.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }

    public void restoreState(Bundle inState) {
        mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }
}
