package view.edit.input.gaad_preference;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by hp on 6/13/2018.
 */

public class MyPreferenceFragment extends PreferenceFragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.edit_info);
    }
}
