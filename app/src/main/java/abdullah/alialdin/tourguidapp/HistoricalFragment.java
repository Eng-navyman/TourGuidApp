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

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.karnak), 4.8f,
                R.drawable.karnak, "geo:25.719705,32.657099?q=temple+karnak"));
        places.add(new Place(getString(R.string.nefertari), 4.8f,
                R.drawable.nefertari, "geo:25.728709,32.592911?q=tomb+of+nefertari"));
        places.add(new Place(getString(R.string.habu), 4.8f,
                R.drawable.habu, "geo:25.719526,32.601308?q=medinat+habu"));
        places.add(new Place(getString(R.string.ramses_6), 5,
                R.drawable.ramses6, "geo:25.740203,32.601358?q=tomb+of+ramses+6"));
        places.add(new Place(getString(R.string.sennedjem), 4.7f,
                R.drawable.sennedjem, "geo:25.728083,32.601393?q=tomb+of+sennedjem"));
        places.add(new Place(getString(R.string.ramses_3), 5,
                R.drawable.recesses3, "geo:25.740222,32.601401?q=tomb+of+ramses+3"));
        places.add(new Place(getString(R.string.kings_vally), 4.7f,
                R.drawable.kings_vally, "geo:25.740222,32.601401?q=valley+of+kings"));
        places.add(new Place(getString(R.string.tutankhamun), 4.6f,
                R.drawable.tutankhamun, "geo:25.740516,32.601408?q=tomb+tutankhamun"));
        places.add(new Place(getString(R.string.hatshepsut), 4.7f,
                R.drawable.hatshepsut, "geo:25.738235,32.606618?q=temple+hatshepsut"));
        places.add(new Place(getString(R.string.merenptah), 4.5f,
                R.drawable.merenptah, "geo:25.724919,32.606666?q=temple+of+merenptah"));
        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);
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
