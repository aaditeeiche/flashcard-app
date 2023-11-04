package com.example.flashcardsapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Flashcard.class}, version = 4)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.example.flashcardsapp.FlashcardDao flashcardDao();
}