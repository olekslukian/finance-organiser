package com.financeorganiser.features.auth.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.financeorganiser.R
import com.financeorganiser.navigation.Screen
import com.financeorganiser.ui.Constants

@Composable
fun AuthView(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(horizontal = Constants.DEFAULT_SPACING)
    ) {
        Text(stringResource(R.string.welcome_string))
        Spacer(modifier = Modifier.height(Constants.DEFAULT_SPACING))
        Button(onClick = { /*TODO: Implement when backend will be ready*/ }) {
            Text(stringResource(R.string.log_in))
        }
        Spacer(modifier = Modifier.height(Constants.DEFAULT_SPACING))
        Button(onClick = { navController.navigate(Screen.HomeScreen.route) }) {
            Text(stringResource(R.string.use_app_without_login))
        }
    }

}