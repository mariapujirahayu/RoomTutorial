package co.twoh.roomtutorial.data.factory;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import co.twoh.roomtutorial.data.BarangDAO;
import co.twoh.roomtutorial.model.Barang;

/**
 * Created by Herdi_WORK on 21.01.18.
 */

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BarangDAO barangDAO();

}