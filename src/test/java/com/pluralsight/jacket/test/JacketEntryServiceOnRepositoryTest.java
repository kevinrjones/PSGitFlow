package com.pluralsight.jacket.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import com.pluralsight.jacket.entry.data.models.Entry;
import com.pluralsight.jacket.entry.repository.EntryRepository;
import com.pluralsight.jacket.entry.service.EntryRepositoryEntryDetailsService;
import com.pluralsight.jacket.entry.service.models.JacketEntry;

public class JacketEntryServiceOnRepositoryTest {
    EntryRepositoryEntryDetailsService jacketEntryServiceOnRepository;
    EntryRepository repository;
    Log log;
    
    @Before
    public void before(){
        repository = mock(EntryRepository.class);
        log = mock(Log.class);
    }

    @Test
    public void shouldReturnAllEntries() {    

        when(repository.findAll()).thenReturn(Arrays.asList(new Entry()));
        
        EntryRepositoryEntryDetailsService service = new EntryRepositoryEntryDetailsService(repository, log);
        List<JacketEntry> entries = service.getAllEntries();

        assertThat(entries.size()).isEqualTo(1);
    }
}
