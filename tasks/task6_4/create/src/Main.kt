// Task 6.4: creating database tables

import org.jetbrains.exposed.v1.jdbc.SchemaUtils
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    transaction(MusicDatabase.db) {
        SchemaUtils.drop(ArtistTable, AlbumTable)
        SchemaUtils.create(ArtistTable, AlbumTable)
    }
}
// this should create the database.
// ./kotlin run -m query
// logging in thr terminal too see executed sql.
// ./kotlin run -m create 
// For jintell idea
