package org.example.SpringSem8Hmwrk.service;

import org.example.SpringSem8Hmwrk.model.Note;

import java.util.List;

/**
 * Интерфейс сервиса для работы с заметками
 * Базовые методы для работы с заметками
 */

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note createNote(Note note);
    Note updateNote(Long id, Note note);
    void deleteNoteById(Long id);
}
