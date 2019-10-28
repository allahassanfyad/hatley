package com.besolutions.hatley.Senarios.Senario_Sex.Patterns;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.besolutions.hatley.R;

public class ExpandableTextViewAdabter extends BaseExpandableListAdapter {
    Context context;

    String[]faqs={
            "Question Number 1",
           "Question Number 2",
           "Question Number 3",
           "Question Number 4",
           "Question Number 5",
           "Question Number 6",
           "Question Number 7",
           "Question Number 8",
           "Question Number 9"
    };

    String[][]answer={{

            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},

            {

                    "Answer To Question Number2 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number3 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number4 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number4 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number5 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number6 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number7 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number8 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},
            {

                    "Answer To Question Number9 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"+
                            "Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 Answer To Question Number1 \n\n"},





    };

    public ExpandableTextViewAdabter(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return faqs.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return answer [groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return faqs[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return answer[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String questionfaq = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.faqs_title, null);
        }
        TextView questionfaq2 = convertView.findViewById(R.id.faqtitleview);
        questionfaq2.setTypeface(null, Typeface.BOLD);
        questionfaq2.setText(questionfaq);
        return convertView;

    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String answerFaq = (String)getChild(groupPosition,childPosition);
        if (convertView==null){
            LayoutInflater inflater= (LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.faq_answer,null);
        }
        TextView answerfaq2 =convertView.findViewById(R.id.describtionfaqview);
        answerfaq2.setText(answerFaq);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
