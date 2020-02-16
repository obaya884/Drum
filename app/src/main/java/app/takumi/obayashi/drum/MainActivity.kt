package app.takumi.obayashi.drum

import android.media.AudioAttributes
import android.media.SoundPool
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mSoundPool: SoundPool

    private lateinit var mSoundId: Array<Int?>

    private val mSoundResource = arrayOf(
        R.raw.cymbal1,
        R.raw.cymbal2,
        R.raw.cymbal3,
        R.raw.tom1,
        R.raw.tom2,
        R.raw.tom3,
        R.raw.hihat,
        R.raw.snare,
        R.raw.bass
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(mSoundResource.size)
            .build()

        mSoundId = arrayOfNulls(mSoundResource.size)

        for (i in 0..(mSoundResource.size - 1)) {
            mSoundId[i] = mSoundPool.load(applicationContext, mSoundResource[i], 0)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mSoundPool.release()
    }

    fun cymbal1(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun cymbal2(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun cymbal3(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun tom1(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun tom2(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun tom3(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun hihat(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun snare(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }

    fun bass(view: View) {
        if (mSoundId[0] != null) {
            mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
        }
    }
}
