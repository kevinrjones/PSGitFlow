package com.pluralsight.jacket.entry.service;

import java.util.List;

import com.pluralsight.jacket.entry.service.models.JacketEntry;

/**
 * Created by kevin on 03/07/2015.
 */
public interface JacketEntryService {

    List<JacketEntry> getAllEntries();
    JacketEntry getEntry(long id);
    void updateEntry(JacketEntry entry);
}
