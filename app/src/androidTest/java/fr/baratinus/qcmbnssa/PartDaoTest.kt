package fr.baratinus.qcmbnssa

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import fr.baratinus.qcmbnssa.data.database.BNSSADatabase
import fr.baratinus.qcmbnssa.data.database.dao.PartDao
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PartDaoTest {
    private lateinit var partDao: PartDao
    private lateinit var bnssaDatabase: BNSSADatabase

    @Before
    fun setup() {
        val context = InstrumentationRegistry.getInstrumentation().context
        bnssaDatabase = Room.inMemoryDatabaseBuilder(context, BNSSADatabase::class.java)
            .build()
        partDao = bnssaDatabase.partDao
    }

    @After
    fun cleanup() {
        bnssaDatabase.close()
    }
}