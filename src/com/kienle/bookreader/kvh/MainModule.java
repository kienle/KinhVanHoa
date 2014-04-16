package com.kienle.bookreader.kvh;

import com.google.inject.AbstractModule;
import com.kienle.bookreader.kvh.library.LibraryService;
import com.kienle.bookreader.kvh.library.SQLiteLibraryService;


public class MainModule extends AbstractModule {
	@Override
	protected void configure() {
		this.bind(LibraryService.class).to(SQLiteLibraryService.class);
	}
}
