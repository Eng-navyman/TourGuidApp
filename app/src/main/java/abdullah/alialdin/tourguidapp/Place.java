package abdullah.alialdin.tourguidapp;

public class Place {

    private String mPlaceName;
    private float mRating;
    private int mImageResource;
    private String mLocationUri;

    Place(String name, float rating, int imageResource, String locationUri) {
        mPlaceName = name;
        mRating = rating;
        mImageResource = imageResource;
        mLocationUri = locationUri;
    }

    public String getLocationUri() {
        return mLocationUri;
    }

    String getPlaceName() {
        return mPlaceName;
    }

    float getRating() {
        return mRating;
    }

    int getImageResource() {
        return mImageResource;
    }


}
