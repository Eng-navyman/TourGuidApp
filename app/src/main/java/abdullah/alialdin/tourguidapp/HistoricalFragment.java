package abdullah.alialdin.tourguidapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {


    public HistoricalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Temple of Karnak", 5, R.drawable.ic_launcher_foreground));
        places.add(new Place("Tomb of Queen Nefertari", 5, R.drawable.ic_launcher_foreground));
        places.add(new Place("Temple of Medinat Habu", 5, R.drawable.ic_launcher_foreground));
        places.add(new Place("Tomb of Ramses VI", 5, R.drawable.ic_launcher_foreground));
        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);
        ListView listView = rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}
