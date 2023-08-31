package com.example.singlemoduleapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.singlemoduleapplication.ui.theme.SingleModuleApplicationTheme

class FeatureAActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			SingleModuleApplicationTheme {
				Column(
					modifier = Modifier.fillMaxSize(),
					verticalArrangement = Arrangement.Center,
					horizontalAlignment = Alignment.CenterHorizontally
				) {
					Text(text = "Feature A Screen")

					Button(
						modifier = Modifier.padding(all = 16.dp),
						onClick = {
							val intent = Intent(this@FeatureAActivity, FeatureBActivity::class.java)
							startActivity(intent)
						}
					) {
						Text(text = "Start Feature B")
					}
				}
			}
		}
	}
}