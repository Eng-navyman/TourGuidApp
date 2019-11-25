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

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.mummification), 4.4f,
                R.drawable.mummification, "geo:25.702362,32.639875?q=mummification"));
        places.add(new Place(getString(R.string.scarabe), 4,
                R.drawable.scarabe, "geo:25.714879,32.621951?q=le+scarabe+papyrus"));
        places.add(new Place(getString(R.string.art_gallery), 4,
                R.drawable.art_gallery, "geo:25.703750,32.632746?q=luxor+art+gallery"));
        places.add(new Place(getString(R.string.papyrus), 4,
                R.drawable.papyrus, "geo:25.727604,32.657727?q=isis+papyrus+museum"));
        places.add(new Place(getString(R.string.howard_carter), 4.4f,
                R.drawable.howard_carter, "geo:25.738931,32.628170?q=howard+carter+house"));
        places.add(new Place(getString(R.string.eldaly), 5,
                R.drawable.eldaly, "geo:25.690022,32.633137?q=eldaly+gallery"));
        places.add(new Place(getString(R.string.open_air), 4.8f,
                R.drawable.open_air, "geo:25.718864,32.657270?q=karnak+open+air"));
        places.add(new Place(getString(R.string.luxor), 4.6f,
                R.drawable.luxor, "geo:25.707642,32.644517?q=luxor+museum"));
        places.add(new Place(getString(R.string.obelisk), 5,
                R.drawable.obelisk, "geo:25.718429,32.658243?q=obelisk+of+thutmosis"));
        places.add(new Place(getString(R.string.assasif), 3,
                R.drawable.assasif, "geo:25.729495,32.606218?q=south+asasif"));
        places.add(new Place(getString(R.string.alabaster), 4,
                R.drawable.alabaster, "geo:25.733073,32.624398?q=imhotep+factory+alabaster"));
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
