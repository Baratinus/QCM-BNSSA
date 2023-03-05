package fr.baratinus.qcmbnssa.ui.views

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import fr.baratinus.qcmbnssa.data.database.BNSSADatabase
import fr.baratinus.qcmbnssa.data.database.dao.AnswerDao
import fr.baratinus.qcmbnssa.data.database.dao.PartDao
import fr.baratinus.qcmbnssa.data.database.dao.QuestionDao
import fr.baratinus.qcmbnssa.data.database.entities.Part
import fr.baratinus.qcmbnssa.ui.theme.QCMBNSSATheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QCMBNSSATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }


        // Part(1, "test", 1, 2, "1.0.0")

        val partDao: PartDao = BNSSADatabase.getDatabase(applicationContext).partDao
        val questionDao: QuestionDao = BNSSADatabase.getDatabase(applicationContext).questionDao
        val answerDao: AnswerDao = BNSSADatabase.getDatabase(applicationContext).answerDao

        //dao.getAll()
        // questionDao.getAll()
        answerDao.getAll()

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QCMBNSSATheme {
        Greeting("Android")
    }
}