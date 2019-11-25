package abdullah.alialdin.tourguidapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurant_1886), 4.2f,
                R.drawable.restaurant_1886, "geo:25.696626,32.637084?q=1886+restaurant"));
        places.add(new Place(getString(R.string.la_fleur), 4.8f,
                R.drawable.la_fleur, "geo:25.669016,32.620865?q=la+fleur+restaurant"));
        places.add(new Place(getString(R.string.victoria_room), 4.5f,
                R.drawable.victoria_room, "geo:25.696505,32.637286?q=winter+palace"));
        places.add(new Place(getString(R.string.corniche_restaurant), 4,
                R.drawable.corniche, "geo:25.697178,32.637006?q=corniche+restaurant"));
        places.add(new Place(getString(R.string.bonjour_cafe), 4.5f,
                R.drawable.bonjour, "geo:25.687764,32.637665?q=bonjour+cafe+luxor"));
        places.add(new Place(getString(R.string.quick_pizza), 4.2f,
                R.drawable.quick_pizza, "geo:25.692629,32.640014?q=quick+pizza"));
        places.add(new Place(getString(R.string.alsahaby), 4.3f,
                R.drawable.alsahaby, "geo:25.701615,32.642176?q=alsahaby+lane+restaurant"));
        places.add(new Place(getString(R.string.sofra), 4.4f,
                R.drawable.sofra, "geo:25.694854,32.642402?q=sofra+restaurant"));
        places.add(new Place(getString(R.string.gerda), 4,
                R.drawable.gerda, "geo:25.729340,32.659010?q=greda+garden"));
        places.add(new Place(getString(R.string.jewel), 3.9f,
                R.drawable.jewel, "geo:25.686663,32.636551?q=jewel+of+the+nile"));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Place place = places.get(i);
                Uri intentUri = Uri.parse(place.getLocationUri());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
        return rootView;
    }

}
