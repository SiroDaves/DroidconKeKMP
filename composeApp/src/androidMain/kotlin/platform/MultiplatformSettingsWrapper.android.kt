package platform

import android.content.Context
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings

actual class MultiplatformSettingsWrapper(private val context: Context) {

    actual fun createSettings(): Settings {
        val delegate = context.getSharedPreferences("dcke_preferences", Context.MODE_PRIVATE)
        return SharedPreferencesSettings(delegate)
    }
}