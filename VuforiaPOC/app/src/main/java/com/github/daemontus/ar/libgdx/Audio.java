package com.github.daemontus.ar.libgdx;

import android.content.Context;
import android.media.MediaPlayer;



import java.io.File;

/**
 * Created by jamamwitwit on 12/03/2018.
 */

public class Audio {

    public void audioPlayer(Context context, int sound ){
        //set up MediaPlayer

        Context c = context;

        MediaPlayer mp = MediaPlayer.create(context, sound);
        mp.start();
    }

}
