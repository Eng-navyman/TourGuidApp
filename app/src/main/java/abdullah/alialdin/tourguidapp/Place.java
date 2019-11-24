package abdullah.alialdin.tourguidapp;

public class Place {

    private String mPlaceName;
    private float mRating;
    private int mImageResource;

    public String getPlaceName() {
        return mPlaceName;
    }

    public float getRating() {
        return mRating;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public Place (String name, float rating, int imageResource){
        mPlaceName = name;
        mRating = rating;
        mImageResource = imageResource;
    }


}
