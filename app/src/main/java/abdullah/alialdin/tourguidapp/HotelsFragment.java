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


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.hilton), 4.7f,
                R.drawable.hilton, "geo:25.73012069748991,32.656053665117504?q=hilton"));
        places.add(new Place(getString(R.string.sofitel), 4.5f,
                R.drawable.sofitel, "geo:25.696146954929592,32.63869005582536?q=sofitel+hotel"));
        places.add(new Place(getString(R.string.sonesta), 4.4f,
                R.drawable.sonesta, "geo:25.68856555281387,32.63136226079667?q=sonesta"));
        places.add(new Place(getString(R.string.cleopatra), 4.5f,
                R.drawable.cleopatra, "geo:25.699617281750648,32.642876984097605?q=cleopatra+hotel"));
        places.add(new Place(getString(R.string.steigenberger), 4.5f,
                R.drawable.steigenberger, "geo:25.690017,32.632433?q=steigenberger+hotel"));
        places.add(new Place(getString(R.string.pavillon), 4.6f,
                R.drawable.pavillon, "geo:25.696137915872598,32.63835979071474?q=hotel+pavillon+winter"));
        places.add(new Place(getString(R.string.moudira), 4.2f,
                R.drawable.moudira, "geo:25.684593,32.552692?q=moudira"));
        places.add(new Place(getString(R.string.pyramisa), 3.8f,
                R.drawable.pyramisa, "geo:25.686042,32.630686?q=pyramisa+isis+hotel"));
        places.add(new Place(getString(R.string.jolie), 4.5f,
                R.drawable.jolie, "geo:25.665815, 32.621696?q=jolie+ville"));
        places.add(new Place(getString(R.string.mercure), 4.4f,
                R.drawable.mercure, "geo:25.741452, 32.662470?q=mercure"));
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
