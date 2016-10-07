package com.science.main;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.science.main.R;

public class ScrollViewFragment extends ScrollTabHolderFragment implements NotifyingScrollView.OnScrollChangedListener {

    private static final String ARG_POSITION = "position";


    private NotifyingScrollView mScrollView;

    TextView cardTitle1, cardTitle2, cardTitle3;
    TextView cardDescription1, cardDescription2, cardDescription3;
    TextView textSendEmail;
    TextView textContact;
    TextView textEmail;
    LinearLayout layout1;
    LinearLayout layout2;
    LinearLayout layout3;

    ImageView titleImage1, titleImage2, titleImage3;

    private int mPosition;
    private CardView cardView1, cardView2, cardView3;

    public static Fragment newInstance(int position) {
        ScrollViewFragment f = new ScrollViewFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPosition = getArguments().getInt(ARG_POSITION);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_scrollview, null);
        initializeWidgets(v);


        if (mPosition==0){
            layout1.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            layout3.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            setViews(mPosition);
        }
        if (mPosition==1) {
            layout1.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            layout3.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            setViews(mPosition);
        }
        if (mPosition==2) {
            layout1.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            layout3.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            setViews(mPosition);
        }
        if (mPosition==3) {
            layout1.setBackgroundColor(getResources().getColor(R.color.primary_material_dark));
            layout2.setBackgroundColor(getResources().getColor(R.color.primary_material_dark));
            layout3.setBackgroundColor(getResources().getColor(R.color.primary_material_dark));
            setViews(mPosition);
        }
        if (mPosition==4) {
            layout1.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            layout3.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            setViews(mPosition);
        }
        return v;
    }

    private void setViews(int mPosition)
    {
        Log.v("TAG", "Image URL : "+MainActivity.newsDataModel[mPosition].getSubcategories().get(0).getImageUrl().replace("\\", ""));
        Log.v("TAG", "Image URL : "+MainActivity.newsDataModel[mPosition].getSubcategories().get(1).getImageUrl().replace("\\", ""));
        Log.v("TAG", "Image URL : "+MainActivity.newsDataModel[mPosition].getSubcategories().get(2).getImageUrl().replace("\\", ""));
        cardTitle1.setText(MainActivity.newsDataModel[mPosition].getSubcategories().get(0).getSubCategoryName());
        cardTitle2.setText(MainActivity.newsDataModel[mPosition].getSubcategories().get(1).getSubCategoryName());
        cardTitle3.setText(MainActivity.newsDataModel[mPosition].getSubcategories().get(2).getSubCategoryName());
        cardDescription1.setText(MainActivity.newsDataModel[mPosition].getSubcategories().get(0).getDescription());
        cardDescription2.setText(MainActivity.newsDataModel[mPosition].getSubcategories().get(1).getDescription());
        cardDescription3.setText(MainActivity.newsDataModel[mPosition].getSubcategories().get(2).getDescription());
        Glide.with(this).load(MainActivity.newsDataModel[mPosition].getSubcategories().get(0).getImageUrl().replace("\\","")).into(titleImage1);
        Glide.with(this).load(MainActivity.newsDataModel[mPosition].getSubcategories().get(1).getImageUrl().replace("\\", "")).into(titleImage2);
        Glide.with(this).load(MainActivity.newsDataModel[mPosition].getSubcategories().get(2).getImageUrl().replace("\\", "")).into(titleImage3);
    }

    private void initializeWidgets(View v)
    {
        cardDescription3 =(TextView) v.findViewById(R.id.card_description3);
        mScrollView = (NotifyingScrollView) v.findViewById(R.id.scrollview);
        mScrollView.setOnScrollChangedListener(this);
        layout1=(LinearLayout) v.findViewById(R.id.cardlayout1);
        layout2=(LinearLayout) v.findViewById(R.id.cardlayout2);
        layout3=(LinearLayout) v.findViewById(R.id.cardlayout3);
        cardDescription1 =(TextView) v.findViewById(R.id.card_description1);
        cardDescription2 =(TextView) v.findViewById(R.id.card_description2);
        cardTitle1 = (TextView) v.findViewById(R.id.card_title1);
        cardTitle2 = (TextView) v.findViewById(R.id.card_title2);
        cardTitle3 = (TextView) v.findViewById(R.id.card_title3);
        titleImage1 =(ImageView) v.findViewById(R.id.card_titleImage1);
        titleImage2 =(ImageView) v.findViewById(R.id.card_titleImage2);
        titleImage3 =(ImageView) v.findViewById(R.id.card_titleImage3);
        cardView1 =(CardView) v.findViewById(R.id.cardView1);
        cardView2 =(CardView) v.findViewById(R.id.cardView2);
        cardView3 =(CardView) v.findViewById(R.id.cardView3);
        cardView1.setPadding(30,30,30,30);
        cardView2.setPadding(30,30,30,30);
        cardView3.setPadding(30,30,30,30);
        textContact = (TextView) v.findViewById(R.id.textContact);
        textEmail = (TextView) v.findViewById(R.id.textEmail);
        textSendEmail = (TextView) v.findViewById(R.id.textSendEmail);


        textSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = textEmail.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setType("text/plain");
                emailIntent.setData(Uri.parse("mailto:" + email));
                emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(emailIntent);
            }
        });


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    @Override
    public void adjustScroll(int scrollHeight, int headerTranslationY)
    {
        mScrollView.setScrollY(headerTranslationY - scrollHeight);
    }

    @Override
    public void onScrollChanged(ScrollView view, int l, int t, int oldl, int oldt)
    {
        if (mScrollTabHolder != null)
            mScrollTabHolder.onScroll(view, l, t, oldl, oldt, mPosition);

    }



}
