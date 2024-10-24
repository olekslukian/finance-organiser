package com.financeorganiser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.financeorganiser.navigation.Navigation
import com.financeorganiser.ui.theme.FinanceOrganiserTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FinanceOrganiserTheme {
                Navigation()
            }
        }
    }
}


