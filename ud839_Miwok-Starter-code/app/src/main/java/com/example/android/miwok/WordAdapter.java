package com.example.android.miwok;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorID){
        super(context, 0, words);

        mColorID = ContextCompat.getColor(getContext(), colorID);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image_view);

        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.linear_layout);
        linearLayout.setBackgroundColor(mColorID);

        /*listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getAudioSource());
                mediaPlayer.start();
            }
        });*/

        if (currentWord.hideImage())
            imageView.setVisibility(View.GONE);
        else {
            imageView.setImageResource(currentWord.getImageSource());
            imageView.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}
