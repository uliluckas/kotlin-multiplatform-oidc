package org.publicvalue.multiplatform.oauth.sample

import MainView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // workaround for not-closing custom tab
        HandleRedirectActivity.mainActivityClass = this.javaClass.kotlin
        setContent {
            MainView()
        }
    }
}