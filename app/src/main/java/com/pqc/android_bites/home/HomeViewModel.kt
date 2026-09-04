package com.pqc.android_bites.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class MiniProject(
    val id: Int,
    val title: String,
    val technology: String,
    val route: String
)

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _projects = MutableStateFlow<List<MiniProject>>(emptyList())
    val projects: StateFlow<List<MiniProject>> = _projects.asStateFlow()

    init {
        _projects.value = listOf(
            MiniProject(1, "ScanIt", "CameraX", "scanit"),
            MiniProject(2, "CardGrab", "ML Kit Text Recognition", "cardgrab"),
            MiniProject(3, "PriceSnap", "ML Kit Barcode Scanning", "pricesnap"),
            MiniProject(4, "LockNote", "Biometric API", "locknote"),
            MiniProject(5, "FaceMark", "Face Detection", "facemark"),
            MiniProject(6, "PlayLoop", "Media3/ExoPlayer", "playloop"),
            MiniProject(7, "ThemeFlip", "DataStore", "themeflip"),
            MiniProject(8, "MemeFeed", "Paging3", "memefeed"),
            MiniProject(9, "HomeAlert", "Geofencing", "homealert"),
            MiniProject(10, "StepPulse", "Foreground Service", "steppulse"),
            MiniProject(11, "AutoBackup", "WorkManager", "autobackup"),
            MiniProject(12, "HydraTrack", "Health Connect", "hydratrack"),
            MiniProject(13, "DailyQuote", "App Widgets", "dailyquote"),
            MiniProject(14, "TapShare", "NFC", "tapshare"),
            MiniProject(15, "PulseBand", "Bluetooth LE", "pulseband"),
            MiniProject(16, "VoiceJot", "Speech-to-Text/TTS", "voicejot"),
            MiniProject(17, "ScreenGrab", "MediaProjection", "screengrab"),
            MiniProject(18, "RateNudge", "In-App Review API", "ratenudge"),
            MiniProject(19, "AdFree", "Play Billing", "adfree"),
            MiniProject(20, "FocusLock", "Accessibility Service", "focuslock"),
            MiniProject(21, "MiniPlay", "Picture-in-Picture", "miniplay"),
            MiniProject(22, "ARule", "AR/CameraX", "arule"),
            MiniProject(23, "QuickCall", "WebRTC", "quickcall"),
            MiniProject(24, "TapDonate", "Google Pay API", "tapdonate")
        )
    }
}
