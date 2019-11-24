package abdullah.alialdin.tourguidapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Mummification Museum", 3.5f, R.drawable.ic_launcher_foreground));
        places.add(new Place("Le Scarabe Papyrus Museum", 4, R.drawable.ic_launcher_foreground));
        places.add(new Place("Luxor Art Gallery", 4, R.drawable.ic_launcher_foreground));
        places.add(new Place("Isis 2 Papyrus Museum", 4, R.drawable.ic_launcher_foreground));
        places.add(new Place("Howard Carter House", 4.5f, R.drawable.ic_launcher_foreground));
        places.add(new Place("El Daly Gallery", 5, R.drawable.ic_launcher_foreground));
        places.add(new Place("Karnak Open Air Museum", 4.5f, R.drawable.ic_launcher_foreground));
        places.add(new Place("Luxor Museum", 4.5f, R.drawable.ic_launcher_foreground));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}
