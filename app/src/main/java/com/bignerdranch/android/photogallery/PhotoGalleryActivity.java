package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
