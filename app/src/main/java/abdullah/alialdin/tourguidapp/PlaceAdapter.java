package abdullah.alialdin.tourguidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Place place = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView placeName = convertView.findViewById(R.id.place_name);
        assert place != null;
        placeName.setText(place.getPlaceName());

        RatingBar rating = convertView.findViewById(R.id.place_rate);
        rating.setRating(place.getRating());

        ImageView placeImage = convertView.findViewById(R.id.image);
        placeImage.setImageResource(place.getImageResource());

        return convertView;
    }
}
